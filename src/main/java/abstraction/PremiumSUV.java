package abstraction;

public class PremiumSUV extends LuxuryCar {

    public PremiumSUV()
    {
        setColor("White");
        setAudioMake("Harmon");
    }

    @Override
    public void addAddLuxuryAudioSystem() {
        System.out.println("I am using " + getAudioMake() + " Audio System");
    }

    @Override
    public void createCar() {
        System.out.println("I am creating a premium sedan");
    }

    @Override
    public void addWinShield() {
        System.out.println("I am adding wind shield");
    }

    @Override
    public void addWheels() {
        System.out.println("I am adding wheels");
    }

    @Override
    public void addEngine() {
        System.out.println("I am adding engine");
    }
}
