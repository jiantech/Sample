package jsonhandling;

public class Profile {
    private String name;
    private Address address;
    private String dob;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", dob='" + dob + '\'' +
                '}';
    }
}
