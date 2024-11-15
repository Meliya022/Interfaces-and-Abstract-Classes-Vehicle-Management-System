public class Main {
    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Car car = new Car("Toyota Corolla");
        Motorcycle motorcycle = new Motorcycle("Harley Davidson");

        // Test Car methods
        car.start();
        car.honk();
        car.stop();

        // Test Motorcycle methods
        motorcycle.start();
        motorcycle.honk();
        motorcycle.stop();
    }
}


