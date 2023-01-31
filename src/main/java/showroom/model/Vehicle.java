package showroom.model;

import showroom.model.enums.*;

/**
 * Abstrakcyjna klasa, która zawiera część wspólną wszystkich pojazdów w systemie
 * Klasa jest abstrakcyjna, więc nie można stworzyć jej instancji!
 */
public abstract class Vehicle {
    private Long id;
    private BrandType brand;
    private ModelType model;
    private ColourType colour;
    private EngineType engine;
    private double mileage;
    private GearboxType gearboxType;
    private boolean isUsed;

    /**
     * Bezparametrowy konstruktor. Inicjując za pomocą niego obiekt, możemy potem
     * określić wartości pól za pomocą setterów
     */
    public Vehicle(){

    }

    /**
     * Konstruktor ze wszystkimi argumentami
     * @param brand marka
     * @param model model
     * @param colour kolor
     * @param engine silnik
     * @param mileage przebieg
     * @param gearboxType typ skrzyni biegów
     * @param isUsed czy używany
     */
    public Vehicle(BrandType brand, ModelType model, ColourType colour, EngineType engine, double mileage,
                   GearboxType gearboxType, boolean isUsed) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.engine = engine;
        this.mileage = mileage;
        this.gearboxType = gearboxType;
        this.isUsed = isUsed;
    }

    /**
     * Abstrakcyjna metoda, która zaimplementowana w klasach {@link Car} i {@link Motorbike}
     * @return {@link Car.SimpleCar} lub {@link Motorbike.SimpleMotorbike}
     */
    public abstract Object getSimpleVehicle();

    /*
    Settery i gettery (mutatory)
     */
    public BrandType getBrand() {
        return brand;
    }

    public void setBrand(BrandType brand) {
        this.brand = brand;
    }

    public ModelType getModel() {
        return model;
    }

    public void setModel(ModelType model) {
        this.model = model;
    }

    public ColourType getColour() {
        return colour;
    }

    public void setColour(ColourType colour) {
        this.colour = colour;
    }

    public EngineType getEngine() {
        return engine;
    }

    public void setEngine(EngineType engine) {
        this.engine = engine;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(GearboxType gearboxType) {
        this.gearboxType = gearboxType;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Nadpisanie metody z {@link Object#toString()} pozwala uniknąć zwracania referencji do obiektu
     * przy wywołaniu. Zamiast tego otrzymujemy własną wiadomość
     * @return zwykły {@link String}
     */
    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand=" + brand +
                ", model=" + model +
                ", colour=" + colour +
                ", engine=" + engine +
                ", mileage=" + mileage +
                ", gearboxType=" + gearboxType +
                ", isUsed=" + isUsed +
                '}';
    }
}
