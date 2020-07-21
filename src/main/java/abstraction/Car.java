package abstraction;

public abstract class Car {
    private String color;
    public final String BRAND = "Audi";
    public static int WHEELS = 4;

    public abstract void createCar();

    public abstract void addWinShield();

    public abstract void addWheels();

    public abstract void addEngine();

    public void setColor(String color)
    {
        this.color = color;
    }

    public void paint() {
        System.out.println("I am painting the car " + color + "!!!");
    }
}
