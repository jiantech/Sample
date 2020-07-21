package abstraction;

public class SUV extends Car{

    public SUV()
    {
        setColor("Red");
    }

    @Override
    public void createCar() {
        System.out.println("SUV is being created");
    }

    @Override
    public void addWinShield() {
        System.out.println("Wind shield is being added to SUV");
    }

    @Override
    public void addWheels() {
        System.out.println("Wheels are being added to SUV");
    }

    @Override
    public void addEngine() {
        System.out.println("Engine is being added to SUV");
    }
}
