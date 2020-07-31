package org.example;

public class App 
{
    public static void main( String[] args ){
        Calculator calculator = new Calculator();
        int a = 544;
        int b = 441;

        System.out.println("Calculeaza suma " + a + " si " + b);
        int sum =calculator.sum(a,b);
        System.out.println("Suma este " + sum);

        System.out.println("Inmultirea " + a + " si " + b);
        int rezultatul = calculator.multiply(a,b);
        System.out.println("Rezultatul este " + rezultatul);


        double c = 7.3;
        double d = 3.2;
        System.out.println("Calculeaza suma " + c + " si " + d);
        double doubleSum = calculator.sum(c,d);
        System.out.println("Suma este " + doubleSum);

        System.out.println("Inmultirea " + c + " si " + d);
        double doubleRezultatul = calculator.multiply(c ,d);
        System.out.println("Rezultatul este " + doubleRezultatul);



    }

}
