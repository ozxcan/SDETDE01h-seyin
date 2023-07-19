package j11_Loops_Donguler.While_Loops.Tasks02;

import java.util.Scanner;

public class Task02_10 {
    public static void main(String[] args) {
        /*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        şekli while ile (nxn olacak şekilde ) tek while kullanarak yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir satır değeri: ");
        int satir = scan.nextInt();
        System.out.print("Bir sütun değeri: ");
        int sutun = scan.nextInt();

        int k = 0;
        int yildizAdet = satir*sutun;



        while (yildizAdet>0) {

            if (k != sutun) {
                System.out.print("*"+" ");
                k++;
                yildizAdet--;

            }else {

                System.out.println();
                k=0;


            }


        }

        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        int i = 0; // sütun
        int j = 0; // satır

        while(i<=5 && j <5) {
            if (i!=5){
                i++;
                System.out.print("*"+ " ");

            } else{
                j++;
                System.out.println();
                i=0;
            }

        }










    }


}

