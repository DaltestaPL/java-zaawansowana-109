package showroom.repository;

import showroom.model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Klasa imitująca bazę danych pojazdów
 */
public class VehicleRepository {

    private static Long id = 0L;
    private static final List<Vehicle> vehicles = new ArrayList<>();

    public static List<Vehicle> getVehicles() {
        return vehicles;
    }

    public static void add(Vehicle vehicle) {
        vehicle.setId(id);
        id++;
    }

    public static Optional<Vehicle> findById(Long id) {
        var result = vehicles.stream().filter(v -> id.equals(v.getId())).toList();
        return Optional.ofNullable(result.get(0));
    }

    public static void remove(Long id) {
        vehicles.removeIf(vehicle -> id.equals(vehicle.getId()));
    }

    public static void remove(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}
