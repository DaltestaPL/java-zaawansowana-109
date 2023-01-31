package showroom.service;

import showroom.exceptions.BadObjectException;
import showroom.exceptions.NotFoundException;
import showroom.model.Vehicle;
import showroom.model.enums.BrandType;
import showroom.repository.VehicleRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static showroom.exceptions.ExceptionMessages.OBJECT_CANT_BE_NULL;
import static showroom.exceptions.ExceptionMessages.OBJECT_NOT_FOUND_BY_PROVIDED_ID;

/**
 * Implementacja interfejsu {@link VehicleService}
 */
public class VehicleServiceImpl implements VehicleService {

    /**
     * Metoda realizująca dodanie pojazdu do "bazy danych"
     */
    @Override
    public void addVehicle(Vehicle vehicle) {
        VehicleRepository.add(vehicle);
    }

    /**
     * Metoda pozwalająca na pobranie wszystkich pojazdów z "bazy danych"
     * @return pojazdy
     */
    @Override
    public List<Vehicle> getAllVehicles() {
        return VehicleRepository.getVehicles();
    }

    /**
     * Metoda pozwalająca na pobranie z repozytorium pojazdów danej marki
     * @param brandType marka pojazdu
     * @return lista pojazdów
     */
    @Override
    public List<Vehicle> getVehiclesByBrand(BrandType brandType) {
        Optional.ofNullable(brandType).orElseThrow(() -> new BadObjectException(OBJECT_CANT_BE_NULL));
        return VehicleRepository.getVehicles().stream().filter(v -> brandType.equals(v.getBrand()))
                .collect(Collectors.toList());
    }

    /**
     * Metoda pozwalająca na usunięcie pojazdu o danym id
     * @param id identyfikator pojazdu
     */
    @Override
    public void removeVehicle(Long id) {
        Optional.ofNullable(id).orElseThrow(() -> new BadObjectException(OBJECT_CANT_BE_NULL));
        var vehicle = VehicleRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(OBJECT_NOT_FOUND_BY_PROVIDED_ID));
        VehicleRepository.remove(vehicle);
    }
}
