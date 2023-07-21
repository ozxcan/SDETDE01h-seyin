package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task22 {

    /* task->
      katsayıları a,b,c  verilen 1 bilinmeyenli ax^2 + bx + c denklemin köklerini print eden METHOD create ediniz.



      trick-> kokler : (-b +/- karekök(delta)) / (2*a)
        delta = b*b - 4*a*c
        delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        delta = 0 => 1 tane kök vardır x = -b/2a
        delta < 0 ise kök yoktur.
   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Denklemin a, b ve c sayilarini giriniz\na: ");
        double a = input.nextInt();
        System.out.print("b: ");
        double b = input.nextInt();
        System.out.print("c: ");
        double c = input.nextInt();

        kokler(a,b,c);




    }
    public static void kokler (double a, double b, double c) {
        int delta = (int) (b*b - (4*a*c));
        if (delta < 0) System.out.println("Kök yoktur.");
        else if (delta == 0) {
            double kok= (-1)*b/2*a;
            System.out.println("Kök ==> " + kok);
        }else {
            double kok1= ((-1*b+Math.sqrt(delta))/2*a);
            double kok2= ((-1*b-Math.sqrt(delta))/2*a);
            System.out.println("Birinci kök => " + kok1);
            System.out.println("İkinci kök => " + kok2);
        }
    }
}