public abstract class Vehicle implements Drivable {
    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    // Abstract method to be implemented by subclasses
    public abstract void honk();
}
