package j14_Arrays_Diziler.Sorular;

import java.util.Arrays;

public class S03 {
    public static void main(String[] args) {
        /*
        Dizinin son elemanını yazdırın.
         */

        int[] sayiList={10,3,4,67,5,6};

        System.out.println("Son eleman => " + sayiList[sayiList.length-1]);

        // Soru 2 sayiList dizisinin sayi.length() . elemanını print ediniz.


        //System.out.println("6. eleman => " + sayiList[sayiList.length]); // bu hata verir


        // soru 3 sayiList dizisinin eleman sayısını print ediniz.

        System.out.println("Eleman sayısı => " + sayiList.length);

        // soru 4 sayiList dizisinin 2 ve 3 elemanının toplayıp, 2. elemana koyunuz.

        int sum = sayiList[1] + sayiList[2];
        sayiList [2] = sum;
        System.out.println("İkinci yeni eleman => "+sayiList[2]);


        // soru 5 sayiList dizisini print ediniz.
        for (int i=0; i<sayiList.length; i++){
            System.out.print(sayiList[i]+" ");
        }
        System.out.println();

        // soru 5 sayiList dizisini print ediniz. Diger yöntem
        System.out.println(Arrays.toString(sayiList)); // Bu şekilde de diziyi komple yazdırır. Ama [] parantezler dahil









    }
}
