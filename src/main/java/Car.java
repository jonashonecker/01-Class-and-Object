public class Car {
    String brand;
    String model;
    String color;
    int yearOfManufacture;
    int speed;

    public Car(String brand, String model, String color, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = 0;
    }
    public void start() {
        System.out.println("Brumm Brumm, steig ein!");
    }
    public void accelerate() {
        this.speed++;
    }
}
