package abstraction;

public class Executor {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        sedan.createCar();
        sedan.addWinShield();
        sedan.addWheels();
        sedan.addEngine();
        sedan.paint();

        Car suv = new SUV();
        suv.createCar();
        suv.addWinShield();
        suv.addWheels();
        suv.addEngine();


        //Luxury Car
        LuxuryCar luxurySuv = new PremiumSUV();
        luxurySuv.createCar();
        luxurySuv.addAddLuxuryAudioSystem();
        luxurySuv.addLeather();
        luxurySuv.addEngine();
        luxurySuv.addWheels();
        luxurySuv.addWinShield();
    }
}
