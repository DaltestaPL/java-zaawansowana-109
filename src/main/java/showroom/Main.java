package showroom;

import showroom.model.Car;
import showroom.model.Vehicle;
import showroom.model.enums.*;
import showroom.model.Motorbike;

public class Main {
    public static void main(String[] args) {
        /*
        Przykładowy obiekt samochód
         */
        Car audi = new Car(BrandType.AUDI, ModelType.A4, ColourType.RED, EngineType.V8, 10000,
                GearboxType.AUTOMATIC, false, FuelType.PB95, "car-drive", 5,
                200,5);

        /*
        Przykładowy obiekt motocykl
         */
        Motorbike bmw = new Motorbike(BrandType.BMW, ModelType.X6, ColourType.GREEN, EngineType.V8, 50000,
                GearboxType.AUTOMATIC, true, MotorbikeType.CHOPPER, "łańcuch");

        Vehicle vehicle;
        vehicle = audi;
        System.out.println(vehicle.getSimpleVehicle());
        vehicle = bmw;
        System.out.println(vehicle.getSimpleVehicle());

        /*
          Przykład implementacji klasy anonimowej, czyli tworzę sobie klasę pojazdu latającego
          oraz implementuje jego zachowania
         */
        Vehicle aeroplane = new Vehicle() {
            @Override
            public Object getSimpleVehicle() {
                return new SimpleAeroplane(this);
            }

             static class SimpleAeroplane {
                private final BrandType brandType;

                public SimpleAeroplane(Vehicle vehicle1) {
                    this.brandType = vehicle1.getBrand();
                }

                @Override
                public String toString() {
                    return "SimpleAeroplane{" +
                            "brandType=" + brandType +
                            '}';
                }
            }
        };
        /*
        Podobnie jak w przypadku klas Car oraz Motorbike jestem w stanie ustawić parametry pojazdu
        dla obiektu stworzonego z klasy anonimowej
         */
        aeroplane.setBrand(BrandType.CITROEN);
        System.out.println(aeroplane.getSimpleVehicle());
    }
}
