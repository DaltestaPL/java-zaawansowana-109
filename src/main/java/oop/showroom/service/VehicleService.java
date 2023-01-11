package oop.showroom.service;

import oop.showroom.model.Vehicle;

public interface VehicleService {

    void addVehicle(Vehicle vehicle);

    Vehicle[] getAllVehicles();
}
