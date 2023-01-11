package oop.showroom.service;

import oop.showroom.model.Vehicle;
import oop.showroom.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService {

    @Override
    public void addVehicle(Vehicle vehicle) {
        VehicleRepository.vehicles[0] = vehicle;
    }

    @Override
    public Vehicle[] getAllVehicles() {
        return new Vehicle[0];
    }
}
