package showroom.service;

import org.junit.jupiter.api.Test;
import showroom.model.Car;
import showroom.model.Vehicle;
import showroom.model.enums.BrandType;
import showroom.repository.VehicleRepository;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleServiceTest {

    @Test
    public void should_add_new_vehicle() {
        //given
        BrandType brandType = BrandType.AUDI;
        boolean isUsed = false;
        //and
        Vehicle audi = new Car();
        audi.setBrand(brandType);
        audi.setUsed(isUsed);
        //and
        VehicleService vehicleService = new VehicleServiceImpl();
        //and
        assertTrue(VehicleRepository.getVehicles().isEmpty());

        //when
        vehicleService.addVehicle(audi);

        //then
        assertFalse(VehicleRepository.getVehicles().isEmpty());
        assertEquals(1, VehicleRepository.getVehicles().size());
        //and
        Vehicle vehicle = VehicleRepository.getVehicles().get(0);
        assertNotNull(vehicle);
        assertEquals(brandType, vehicle.getBrand());
        assertEquals(isUsed, vehicle.isUsed());
    }
}
