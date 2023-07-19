package j12_Break_Continue;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        // Task-> rastgele üretilen 7 tamsyının
        // 10 ile 20 arasındakileri hariç toplamını print eden code create ediniz.
        // continue
        Scanner input = new Scanner(System.in);


        int toplam=0;
        for (int i=0; i<7;i++)  {

            int num = (int) (Math.random()*100+1);

            if (num >= 10 && num <= 20){
                continue;
            }
            System.out.print(num+" ");
            toplam += num;
        }
        System.out.println();
        System.out.println("Sayıların toplamı ==> " + toplam);
        System.out.println("------------------------------");

        // while ile

        int i =0;

        while (i<7){

            int num = (int) (Math.random()*100+1);

            if (num >= 10 && num <= 20){
                continue;
            }
            toplam += num;
            System.out.print(num+" ");
            i++;

        }
        System.out.println();
        System.out.println("Sayıların toplamı ==> " + toplam);


    }
}
