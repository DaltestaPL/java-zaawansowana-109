package showroom.service;

import showroom.repository.VehicleRepository;
import showroom.model.Vehicle;

import java.util.List;

/**
 * Implementacja interfejsu {@link VehicleService}
 */
public class VehicleServiceImpl implements VehicleService {

    /**
     * Metoda realizująca dodanie pojazdu do "bazy danych"
     */
    @Override
    public void addVehicle(Vehicle vehicle) {
        VehicleRepository.vehicles.add(vehicle);
    }

    /**
     * Metoda pozwalająca na pobranie wszystkich pojazdów z "bazy danych"
     * @return pojazdy
     */
    @Override
    public List<Vehicle> getAllVehicles() {
        return VehicleRepository.vehicles;
    }
}
