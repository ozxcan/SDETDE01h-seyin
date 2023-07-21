package j14_Arrays_Diziler.Sorular;

import java.util.Arrays;

public class S01 {
    public static void main(String[] args) {

        /*
        Dizin içindeki elemanların toplamını bulunuz.
         */
        int[] sayiList={10,3,4,67,5,6};
        int toplam = 0;
        for (int i =0; i<sayiList.length; i++){
            toplam = toplam +sayiList[i];
        }
        System.out.println("Toplam => " + toplam);
        System.out.println();

        // Ikinci cözüm

        int sum = Arrays.stream(sayiList).sum(); // sayiList. yapınca yanında çıkan sum metodu ile bunu buldum.
        System.out.println("Toplam => " + sum);






    }
}
