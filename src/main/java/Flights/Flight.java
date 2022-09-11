package Flights;

import Persons.CabinCrewMember;
import Persons.Passenger;
import Persons.Pilot;
import Planes.Plane;

import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String depAirport;
    private String depTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> crewMembers, ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination, String depAirport, String depTime) {
        this.pilot = pilot;
        this.crewMembers = crewMembers;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.depAirport = depAirport;
        this.depTime = depTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int findNumOfRemainingSeats() {
        return this.plane.planeType.getNumOfPassengers() - this.passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if (findNumOfRemainingSeats() > 0) {
            this.passengers.add(passenger);
        }
    }
}
