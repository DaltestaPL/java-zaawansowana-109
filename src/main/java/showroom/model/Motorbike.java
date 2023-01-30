package showroom.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import showroom.model.enums.*;

@Getter
@Setter
@NoArgsConstructor
public class Motorbike extends Vehicle {
    private MotorbikeType motorbikeType;
    private String motorbikeDrive;

    public Motorbike(BrandType brand, ModelType model, ColourType colour, EngineType engine, double mileage,
                     GearboxType gearboxType, boolean isUsed, MotorbikeType motorbikeType, String motorbikeDrive) {
        super(brand, model, colour, engine, mileage, gearboxType, isUsed);
        this.motorbikeType = motorbikeType;
        this.motorbikeDrive = motorbikeDrive;
    }

    @Override
    public Object getSimpleVehicle() {
        return new SimpleMotorbike(this);
    }

    @Override
    public String toString() {
        return "Motorbike {" +
                "brand: " + super.getBrand() +
                ", model: " + super.getModel() +
                ", motorbike type: " + motorbikeType +
                ", motorbike drive: " + motorbikeDrive +
                "} ";
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
