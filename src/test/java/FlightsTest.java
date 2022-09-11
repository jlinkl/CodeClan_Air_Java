import Flights.Flight;
import Flights.FlightManager;
import Persons.CabinCrewMember;
import Persons.JobRank;
import Persons.Passenger;
import Persons.Pilot;
import Planes.Plane;
import Planes.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightsTest {

    Plane plane;
    Flight flight;
    FlightManager flightManager;
    Passenger passenger;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    ArrayList<CabinCrewMember> members = new ArrayList<>();
    ArrayList<Passenger> passengers = new ArrayList<>();


    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
        passenger = new Passenger("James", 1);
        pilot = new Pilot("Bill", JobRank.CAPTAIN, "yes");
        cabinCrewMember = new CabinCrewMember("Dave", JobRank.FLIGHT_ATTENDANT);
        members.add(cabinCrewMember);
        passengers.add(passenger);
        flight = new Flight(pilot, members, passengers, plane, "1", "GLA", "EDI", "12:00");
        flightManager = new FlightManager(plane, flight);
    }

    @Test
    public void planeHasPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void passengerHasProperties() {
        assertEquals("James", passenger.getName());
        assertEquals(1, passenger.getNumOfBags());
    }

    @Test
    public void pilotHasProperties() {
        assertEquals("Bill", pilot.getName());
        assertEquals(JobRank.CAPTAIN, pilot.getJobRank());
        assertEquals("yes", pilot.getLicence());
    }

    @Test
    public void membersHasCrewMembers() {
        assertEquals(1, members.size());
    }

    @Test
    public void passengersHasPassengers() {
        assertEquals(1, passengers.size());
    }

    @Test
    public void crewMemberCanRelayMessage() {
        String message = cabinCrewMember.getJobRank() + "speaking, hello";
        assertEquals(message, cabinCrewMember.relayMessage("hello"));
    }
    @Test
    public void flightMethodsWorkAsExpected() {
        assertEquals(passengers, flight.getPassengers());
        Passenger passenger1 = new Passenger("Dave", 2);
        flight.bookPassenger(passenger1);
        assertEquals(2, flight.getPassengers().size());
    }

    @Test
    public void flightManagerMethodsWorkAsExpected() {
        assertEquals(50, flightManager.findWeightForEachPassenger());
        assertEquals(50, flightManager.findTotalWeightBooked());
        assertEquals(4950, flightManager.findRemainingWeight());
    }

}
