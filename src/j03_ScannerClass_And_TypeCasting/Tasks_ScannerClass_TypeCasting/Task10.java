package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {



           /*
            Task->
        Write a Java program to convert temperature from Fahrenheit to Celsius degree.
            formula :  c = (f-32)*5/9
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fahrenheit değerini giriniz: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Sıcaklık değeri " + celsius+ "santigraddır.");




    }






}
