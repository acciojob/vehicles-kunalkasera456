package com.driver;

public class Boat implements WaterVehicle {
    private String getVehicleName;
    private int getVehicleCapacity;

    public String getGetVehicleName() {
        return getVehicleName;
    }

    public void setGetVehicleName(String getVehicleName) {
        this.getVehicleName = getVehicleName;
    }

    public int getGetVehicleCapacity() {
        return getVehicleCapacity;
    }

    public void setGetVehicleCapacity(int getVehicleCapacity) {
        this.getVehicleCapacity = getVehicleCapacity;
    }



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
