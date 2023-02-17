package com.driver;

public class Boat implements WaterVehicle {
    String getVehicleName;
    int getVehicleCapacity;

    public Boat (String name, int capacity) {
        this.getVehicleName = name;
        this.getVehicleCapacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return null;
    }

    @Override
    public int getVehicleCapacity() {
        return 0;
    }
}
