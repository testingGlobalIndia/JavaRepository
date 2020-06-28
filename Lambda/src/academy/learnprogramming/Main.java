package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("printing from the runnable");
            System.out.println("printing next line");
        }).start();

        Employee john = new Employee("John",21);
        Employee james = new Employee("James",23);
        Employee jack = new Employee("Jake",40);
        Employee tim = new Employee("Tim",30);
        Employee snow = new Employee("Snow",22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(snow);
        employees.add(jack);
        employees.add(james);

        Collections.sort(employees, (e1, e2) ->  e1.getName().compareTo(e2.getName()));

        for (Employee emp:employees) {
            System.out.println(emp.getName());
        }

        UpperConcat upperConcat = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
        String sillyString = doStringStuff(upperConcat,employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1,s2);
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

interface UpperConcat {
    String upperAndConcat(String s1,String s2);
}
