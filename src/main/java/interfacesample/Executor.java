package interfacesample;

public class Executor {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        sedan.createCar();
        sedan.addWheels();
        sedan.addWinShield();
        sedan.addEngine();
        sedan.paint();

        Car hatchBack = new HatchBack();
        hatchBack.createCar();
        hatchBack.addWheels();
        hatchBack.addWinShield();
        hatchBack.addEngine();
        hatchBack.paint();

        LuxuryCar premiumSedan = new PremiumSedan();
        premiumSedan.createCar();
        premiumSedan.addWheels();
        premiumSedan.addWinShield();
        premiumSedan.addEngine();
        premiumSedan.paint();
        premiumSedan.addAddLuxuryAudioSystem();
        premiumSedan.addLeather();
    }
}
