package interfacesample;

public class PremiumSedan implements LuxuryCar{
    public void addAddLuxuryAudioSystem()
    {
        System.out.println("I am adding luxury audio system to my premium sedan");
    }

    @Override
    public void addLeather() {
        System.out.println("I am adding leather upholstry to my premium sedan");
    }

    @Override
    public void createCar() {
        System.out.println("I am creating premium sedan");
    }

    @Override
    public void addWinShield() {
        System.out.println("I am adding wind shield to my premium sedan");
    }

    @Override
    public void addWheels() {
        System.out.println("I am adding wheels to my premium sedan");
    }

    @Override
    public void addEngine() {
        System.out.println("I am adding engine to my premium sedan");
    }

    @Override
    public void paint() {
        System.out.println("I am painting my premium sedan");
    }
}
