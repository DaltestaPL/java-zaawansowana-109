package oop.showroom;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Motorbike extends Vehicle{
    private MotorbikeType motorbikeType;
    private String motorbikeDrive;

    public Motorbike(BrandType brand, ModelType model, ColourType colour, EngineType engine, double mileage,
                     GearboxType gearboxType, boolean isUsed, MotorbikeType motorbikeType, String motorbikeDrive) {
        super(brand, model, colour, engine, mileage, gearboxType, isUsed);
        this.motorbikeType = motorbikeType;
        this.motorbikeDrive = motorbikeDrive;
    }

    @Override
    Object getSimpleVehicle() {
        return new SimpleMotorbike(this);
    }

    static class SimpleMotorbike {
        private final BrandType brandType;
        private final MotorbikeType motorbikeType;

        public SimpleMotorbike(Motorbike motorbike) {
            this.brandType = motorbike.getBrand();
            this.motorbikeType = motorbike.getMotorbikeType();
        }

        @Override
        public String toString() {
            return "SimpleMotorbike{" +
                    "brandType=" + brandType +
                    ", motorbikeType=" + motorbikeType +
                    '}';
        }
    }
}
