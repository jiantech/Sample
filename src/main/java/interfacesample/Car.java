package interfacesample;

//A.S interface_kw interface_name
public interface Car {
    public static int WHEELS = 4; // Static variable
    public final String BRAND = "Audi"; // Constants

    //private int x; // Member variable - not possible

    public void createCar();

    public void addWinShield();

    public void addWheels();

    public void addEngine();

    public void paint();
}
