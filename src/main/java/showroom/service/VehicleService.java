package showroom.service;

import showroom.model.Vehicle;

import java.util.List;

/**
 * Interfejs określający jakie funkcjonalności zostaną dostarczone w systemie
 */
public interface VehicleService {

    void addVehicle(Vehicle vehicle);

    List<Vehicle> getAllVehicles();
}
