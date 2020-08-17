package CSVhandling;

public class DataHolder {
    private String name;
    private String age;
    private String location;
    private String state;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "DataHolder{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", location='" + location + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
