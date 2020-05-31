package com.example.packages;

public class Series {

    private static int sum =0;
    private static int fact =1;
    private static int a= 0, b=1;

    public static int nSum(int n){
        for(int i=0;i<=n;i++){
            sum = sum +i;
        }
        return sum;
    }

    public static int factorial(int n){
        for(int i =n;i>=1;i--){
            fact = fact * i;
        }
        return fact;
    }

    public static void fibonacci(int n){
        System.out.println(b); //1
        for(int i=1;i<=n;i++){ //2
            sum = b+a;

            System.out.println(sum); //1
            a = b; // a=5
            b =sum;
        }
    }
}
