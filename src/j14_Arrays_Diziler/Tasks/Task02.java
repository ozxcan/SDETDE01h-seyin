package j14_Arrays_Diziler.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        TASK->
        girilen int array elemanları toplamını print eden code create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Agam kaç elemanlı array istirsen : ");
        int arrayBoyut = scan.nextInt();

        int sum = sum (arrayBoyut);
        System.out.println("Elemanların toplamı ==> " + sum);


    }
    private static int sum (int arrayBoyut) {
        int sum = 0;
        int[] array = new int[arrayBoyut];

        for (int i = 0; i < arrayBoyut; i++) {
            array [i] = (int) (Math.random()*50+1);
            System.out.print(array[i]+ " ");
            sum = sum+array[i];
        }
        System.out.println();
        return sum;
    }
}
