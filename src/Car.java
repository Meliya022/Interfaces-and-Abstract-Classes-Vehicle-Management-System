public class Car extends Vehicle {

    public Car(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println("Car " + model + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car " + model + " is stopping.");
    }

    @Override
    public void honk() {
        System.out.println("Car " + model + " is honking!");
    }
}
