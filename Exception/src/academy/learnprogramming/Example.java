package academy.learnprogramming;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        try {
            int result = divide();
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    private static int divide(){
        int x = getInt();
        int y = getInt();
        System.out.println("x is "+x+ ", y is "+y);
        return x/y;
    }

    private static int getInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer");
        while(true){
            try {
                return sc.nextInt();
            }catch (InputMismatchException ex){
                sc.nextLine();
                System.out.println("Please enter number using only digit 0 to 9");
            }
        }

    }
}
