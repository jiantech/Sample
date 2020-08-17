package jsonhandling;

public class BasicProfile {
    private String basicProfileName;
    private String basicProfileDob;

    public BasicProfile(String basicProfileName, String basicProfileDob)
    {
        this.basicProfileName = basicProfileName;
        this.basicProfileDob = basicProfileDob;
    }

    @Override
    public String toString() {
        return "BasicProfile{" +
                "basicProfileName='" + basicProfileName + '\'' +
                ", basicProfileDob='" + basicProfileDob + '\'' +
                '}';
    }
}
