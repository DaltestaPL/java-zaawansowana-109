package oop.showroom.model;

import oop.showroom.model.enums.*;

public abstract class Vehicle {
    private BrandType brand;
    private ModelType model;
    private ColourType colour;
    private EngineType engine;
    private double mileage;
    private GearboxType gearboxType;
    private boolean isUsed;

    public Vehicle(){

    }

    public Vehicle(BrandType brand, ModelType model, ColourType colour, EngineType engine, double mileage,
                   GearboxType gearboxType, boolean isUsed) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.engine = engine;
        this.mileage = mileage;
        this.gearboxType = gearboxType;
        this.isUsed = isUsed;
    }

    public abstract Object getSimpleVehicle();

    public BrandType getBrand() {
        return brand;
    }

    public void setBrand(BrandType brand) {
        this.brand = brand;
    }

    public ModelType getModel() {
        return model;
    }

    public void setModel(ModelType model) {
        this.model = model;
    }

    public ColourType getColour() {
        return colour;
    }

    public void setColour(ColourType colour) {
        this.colour = colour;
    }

    public EngineType getEngine() {
        return engine;
    }

    public void setEngine(EngineType engine) {
        this.engine = engine;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(GearboxType gearboxType) {
        this.gearboxType = gearboxType;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}
