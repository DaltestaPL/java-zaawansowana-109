package oop.showroom.service;

import oop.showroom.model.Vehicle;
import oop.showroom.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService {

    static int id = 0;
    @Override
    public void addVehicle(Vehicle vehicle) {
        VehicleRepository.vehicles[id] = vehicle;
        id++;
    }

    @Override
    public Vehicle[] getAllVehicles() {
        Vehicle[] tab = VehicleRepository.vehicles;
        int counter = 0;
        for (Vehicle v:tab) {
            if (v != null)
                counter++;
        }
        Vehicle[] result = new Vehicle[counter];

        int index = 0;
        for (Vehicle v:tab) {
            if (v != null) {
                result[index] = v;
                index++;
            }
        }

        return result;
    }
}
