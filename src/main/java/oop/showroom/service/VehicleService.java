package oop.showroom.service;

import oop.showroom.model.Vehicle;

/**
 * Interfejs określający jakie funkcjonalności zostaną dostarczone w systemie
 */
public interface VehicleService {

    void addVehicle(Vehicle vehicle);

    Vehicle[] getAllVehicles();
}
