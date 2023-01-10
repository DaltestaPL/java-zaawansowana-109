package oop.showroom;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String colour;
    private String engine;
    private double mileage;
    private String gearboxType;
    private boolean isUsed;

    public Vehicle(String brand, String model, String colour, String engine, double mileage, String gearboxType, boolean isUsed) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.engine = engine;
        this.mileage = mileage;
        this.gearboxType = gearboxType;
        this.isUsed = isUsed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}
