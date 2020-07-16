package academy.learnprogramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       /* int x= 100;
        int y = 0;
        System.out.println(divideLBYL(x,y));
        System.out.println(divideEAFP(x,y));
        System.out.println(divide(x,y));*/

        int x = getIntEAFP();
        System.out.println("x is "+x);


    }

    private static int getIntLBYL(){
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter any integer");
        String input = scanner.next();
        for(int i=0;i<input.length();i++){
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid)
        return Integer.parseInt(input);
        else
            return 0;
    }

    private static int getIntEAFP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any integer");
        try{
            return sc.nextInt();
        }catch (InputMismatchException ex){
            return 0;
        }

    }

    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int divideLBYL(int x, int y){
        if(y!=0){
            return  x/y;
        }else{
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try{
            return x/y;
        }catch (ArithmeticException exception){
            return 0;
        }
    }

    private static int divide(int x,int y){
        return x/y;
    }
}
