package interfacesample;

//A.S class_kw class_name implements_kw interface_name
public class Sedan implements Car{
    @Override
    public void createCar() {
        System.out.println("I am creating a Sedan");
    }

    @Override
    public void addWinShield() {
        System.out.println("I am adding wind shield to my Sedan");
    }

    @Override
    public void addWheels() {
        System.out.println("I am adding wheels to my Sedan");
    }

    @Override
    public void addEngine() {
        System.out.println("I am adding engine my Sedan");
    }

    @Override
    public void paint() {
        System.out.println("I am adding painting my Sedan");
    }
}
