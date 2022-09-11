package Planes;

public enum PlaneType {
    BOEING747(100,5000),
    AIRBUSA350(200, 20000),
    COMACC919(300, 60000);

    private final int numOfPassengers;
    private final int weightCapacity;

    PlaneType(int numOfPassengers, int weightCapacity) {
        this.numOfPassengers = numOfPassengers;
        this.weightCapacity = weightCapacity;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }
}
