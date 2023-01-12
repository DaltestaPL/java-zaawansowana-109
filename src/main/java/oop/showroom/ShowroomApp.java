package oop.showroom;

import oop.showroom.model.Car;
import oop.showroom.model.Motorbike;
import oop.showroom.model.Vehicle;
import oop.showroom.model.enums.*;
import oop.showroom.repository.VehicleRepository;
import oop.showroom.service.VehicleService;
import oop.showroom.service.VehicleServiceImpl;

import java.util.Arrays;
import java.util.Scanner;

public class ShowroomApp {

    public static void main(String[] args) throws InterruptedException {
        Vehicle audi = new Car(BrandType.AUDI, ModelType.A4, ColourType.RED, EngineType.V8, 10000,
                GearboxType.AUTOMATIC, false, FuelType.PB95, "car-drive", 5,
                200, 5);

        Motorbike bmw = new Motorbike(BrandType.BMW, ModelType.X6, ColourType.GREEN, EngineType.V8, 50000,
                GearboxType.AUTOMATIC, true, MotorbikeType.CHOPPER, "łańcuch");

        VehicleService vehicleService = new VehicleServiceImpl();
        vehicleService.addVehicle(audi);
        vehicleService.addVehicle(bmw);

//        System.out.println(Arrays.toString(VehicleRepository.vehicles));

        Scanner scanner = new Scanner(System.in);
        boolean on = true;

        System.out.println("Witaj w aplikacji salonu pojazdów!");
        Thread.sleep(1000);
        while (on) {
            System.out.println("Jaką operację chcesz wykonać?");
            System.out.println("1 - dodaj nowy samochód");
            System.out.println("2 - dodaj nowy motocykl");
            System.out.println("3 - wyświetl wszystkie pojazdy");
            System.out.println("0 - zakończ program");
            System.out.println("Wpisz odpowiednią liczbę:");
            int decision = scanner.nextInt();
            switch (decision) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Lista wszystkich pojazdów:");
                    for (Vehicle vehicle : vehicleService.getAllVehicles()) {
                        System.out.println(vehicle);
                    }
                    break;
                case 0:
                    on = false;
                    System.out.println("Do widzenia!");
                    break;
                default:
                    System.out.println("Nie ma operacji o takim numerze");
            }
        }

    }
}
