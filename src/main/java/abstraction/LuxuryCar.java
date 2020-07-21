package abstraction;

public abstract class LuxuryCar extends Car{
    private String audioMake;

    public abstract void addAddLuxuryAudioSystem();
    public void addLeather()
    {
        System.out.println("I am adding leather upholstry to the car");
    }

    public void setAudioMake(String audioMake) {
        this.audioMake = audioMake;
    }

    public String getAudioMake() {
        return audioMake;
    }
}
