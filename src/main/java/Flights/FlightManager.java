package Flights;

import Planes.Plane;

public class FlightManager {

    private final Plane plane;
    private final Flight flight;

    public FlightManager(Plane plane, Flight flight) {
        this.plane = plane;
        this.flight = flight;
    }

    public int findWeightForEachPassenger() {
        return this.plane.planeType.getWeightCapacity() / this.plane.planeType.getNumOfPassengers();
    }

    public int findTotalWeightBooked() {
        return this.findWeightForEachPassenger() * this.flight.getPassengers().size();
    }

    public int findRemainingWeight() {
        return this.plane.planeType.getWeightCapacity() - this.findTotalWeightBooked();
    }
}
