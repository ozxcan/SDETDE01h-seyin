package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task07 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz


        System.out.println("En kücük sayı ==> "+ enKucuk());

        System.out.println("==============");
        enKucukSayi();

        System.out.println("==============");



    }//main sonu

    public static int enKucuk () {
        System.out.print("Bir sayı giriniz: ");
        int s1 = input.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int s2 = input.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int s3 = input.nextInt();

        int eK = Math.min(s1,(Math.min(s2,s3)));
        return eK;
    }
    public static void enKucukSayi() {
        System.out.print("Bir sayı giriniz: ");
        int s1 = input.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int s2 = input.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int s3 = input.nextInt();

        int eK = Integer.min(s1,(Integer.min(s2,s3)));
        System.out.println("En kücük sayı ---> " + eK);
    }





}
