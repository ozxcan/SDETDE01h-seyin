package j11_Loops_Donguler.While_Loops.Tasks;

import java.util.Scanner;

public class Task14_Ebob_Ekok {

    //Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak bulunuz

    public static void main(String[] args) {
        int n1, n2;
        Scanner scan =new Scanner(System.in);

        System.out.print("n1 sayısını giriniz : ");
        n1=scan.nextInt();

        System.out.print("n2 sayısını giriniz ");
        n2=scan.nextInt();
        System.out.println();

        int min = Math.min(n1,n2);

        int eBOB = 0;
        int i =1;
        while (i<=min){

            if (n1 % i == 0 && n2 % i == 0) {
                eBOB=i;
            }
            i++;
        }
        System.out.println("EBOB " + eBOB);





    }
}
