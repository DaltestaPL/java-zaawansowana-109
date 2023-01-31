package showroom.service;

import showroom.model.Vehicle;
import showroom.model.enums.BrandType;

import java.util.List;

/**
 * Interfejs określający jakie funkcjonalności zostaną dostarczone w systemie
 */
public interface VehicleService {

    void addVehicle(Vehicle vehicle);

    List<Vehicle> getAllVehicles();

    List<Vehicle> getVehiclesByBrand(BrandType brandType);

    void removeVehicle(Long id);
}
