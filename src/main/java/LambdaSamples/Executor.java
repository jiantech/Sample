package LambdaSamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Executor {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Bharath";
        e1.age = 31;
        e1.position = "Senior Tester";

        Employee e2 = new Employee();
        e2.id = 2;
        e2.name = "Shaji";
        e2.age = 30;
        e2.position = "Senior Tester";

        Employee e3 = new Employee();
        e3.id = 3;
        e3.name = "Eldin";
        e3.age = 30;
        e3.position = "Analyst";

        Employee e4 = new Employee();
        e4.id = 7;
        e4.name = "Sharmila";
        e4.age = 38;
        e4.position = "Consultant";

        Employee e5 = new Employee();
        e5.id = 9;
        e5.name = "Javis";
        e5.age = 21;
        e5.position = "Intern";

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        System.out.println(employeeList.stream().filter(p->p.id == 7).findFirst().get().toString());
        //SELECT * FROM employeeList WHERE id=7

        System.out.println(employeeList.stream().map(p->p.position).distinct().collect(Collectors.joining(",")));
        //SELECT DISTINCT position FROM employeeList

        //employeeList.stream().forEach(p->p.id = p.id + 5);

        System.out.println(employeeList);

        System.out.println(employeeList.stream().allMatch(p->p.id < 100));

        int size = employeeList.size();
        int count =0;
        for(Employee e: employeeList)
        {
            if(e.id < 100)
                count++;
        }
        if(size == count)
            System.out.println("All match");

        System.out.println(employeeList.stream().anyMatch(p->p.position.equals("Intern")));

        System.out.println(employeeList.stream().limit(2).collect(Collectors.toList()));

        System.out.println(employeeList.stream().min(Comparator.comparing(p->p.id)).get());

        System.out.println(employeeList.stream().max(Comparator.comparing(p->p.age)).get());

        employeeList.stream().mapToDouble(p -> p.age).forEach(p-> System.out.println(p));

        System.out.println(employeeList.stream().filter(p->{
            return p.position.contains("Tester");
        }).collect(Collectors.toList()));

        System.out.println(employeeList.stream().filter(isAdultFemale()).collect(Collectors.toList()));

        Collections.sort(employeeList, Comparator.comparingInt(p->p.age));
        System.out.println(employeeList);
    }

    public static Predicate<Employee> isAdultFemale()
    {
        return p -> p.age > 30 && p.position.contains("Tester");
    }
}
