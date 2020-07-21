package abstraction;

public class Sedan extends Car{

    public Sedan()
    {
       setColor("Black");
    }

    @Override
    public void createCar() {
        System.out.println("Sedan is being created");
    }

    @Override
    public void addWinShield() {
        System.out.println("Wind shield is being added to Sedan");
    }

    @Override
    public void addWheels() {
        System.out.println("Wheels are being added to Sedan");
    }

    @Override
    public void addEngine() {
        System.out.println("Engine is being added to Sedan");
    }
}
