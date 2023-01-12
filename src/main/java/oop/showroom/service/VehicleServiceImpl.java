package oop.showroom.service;

import oop.showroom.model.Vehicle;
import oop.showroom.repository.VehicleRepository;

/**
 * Implementacja interfejsu {@link VehicleService}
 */
public class VehicleServiceImpl implements VehicleService {

    /**
     * Metoda realizująca dodanie pojazdu do "bazy danych"
     */
    static int id = 0;
    @Override
    public void addVehicle(Vehicle vehicle) {
        VehicleRepository.vehicles[id] = vehicle;
        id++;
    }

    /**
     * Metoda pozwalająca na pobranie wszystkich pojazdów z "bazy danych"
     * @return pojazdy
     */
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
