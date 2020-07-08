package academy.learnprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla"
        );

        System.out.println(topNames2015
                .stream()
                .map(s->s.substring(0,1).toUpperCase()+s.substring(1,s.length()))
                .filter(s->s.contains("A"))
                .count());




        List<Employee> employees = Arrays.asList(
                new Employee("Jammy Potter", 30),
                new Employee("Harry Wheasely", 34),
                new Employee("Jack Deargo", 67)
        );

        Function<Employee, String> getLastName = (Employee emp) -> {
            return emp.getName().substring(emp.getName().indexOf(' ') + 1);
        };

        Function<Employee, String> getFirstName = (Employee emp) -> {
            return emp.getName().substring(0, emp.getName().indexOf(' '));
        };

        Random random = new Random();
        for(Employee emp : employees){
            if(random.nextBoolean()){
                System.out.println(getAName(getFirstName,emp));
            } else{
                System.out.println(getAName(getLastName,emp));
            }
        }

        System.out.println(getLastName.apply(employees.get(1)));
    }

    public static String getAName(Function<Employee, String> name, Employee employee) {
            return name.apply(employee);
    }

    public static void printAgeOnCondition(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
        System.out.println("==========="+ageText+"=====");
        for (Employee emp:employees) {
            if(ageCondition.test(emp)){
                System.out.println(emp.getAge());
                System.out.println(emp.getName());
            }
        }
    }

    Runnable runnable = () -> {
        String myString = "Let's split this up into array";
        String[] parts = myString.split(" ");
        for(String part: parts){
            System.out.println(part);
        }
    };


    Function<String,String> everySecondChar = (source) -> {
        StringBuilder returnVal = new StringBuilder();
        for(int i=0;i< source.length();i++){
            if(i%2==0){
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    };

    public void everySecondCharacter(Function<String,String> everySecondChar,String characters){
        everySecondChar.apply(characters);
    }

    Supplier<String> characters = ()-> {
        String values = "I love Java";
        return values.trim();
    };






}
