package LambdaSamples;

public class Employee {
    public int id;
    public String name;
    public int age;
    public String position;

    @Override
    public String toString() {
        return "Employee Data :{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
