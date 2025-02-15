public class Motorcycle extends Vehicle {

    public Motorcycle(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle " + model + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle " + model + " is stopping.");
    }

    @Override
    public void honk() {
        System.out.println("Motorcycle " + model + " is honking!");
    }
}

