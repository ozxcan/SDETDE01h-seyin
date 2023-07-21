package j14_Arrays_Diziler.Sorular;

import java.util.Arrays;

public class S04 {
    public static void main(String[] args) {
        /*
        10 elemanlı bir int dizi oluşturun
        içerisini 1 ile 100 arasında random sayı ile doldurun.
        en küçük elemanın indexi ile en büyük elemanın indexi arasında kalan elemanları print edin.
         */

        int [] list = new int [10];
        int indexEnKucuk = 0;
        int indexEnBuyuk = 0;
        int eKucukEleman = list[0];
        int eBuyukEleman = list[0];

        for (int i=0; i<list.length; i++) {
           list[i] = (int) (Math.random()*100+1);


            if (list[i] <= eKucukEleman) { // eşitlik kullanılırsa, son karışalaşılan elemanı kabul eder.
                eKucukEleman = list[i];
                indexEnKucuk = i;

            }
            if (list[i] >= eBuyukEleman) { // eşitlik kullanılırsa, son karışalaşılan elemanı kabul eder.
                eBuyukEleman = list[i];
                indexEnBuyuk = i;
            }

        }
        System.out.println(Arrays.toString(list));
        System.out.println("En küçük index => " +indexEnKucuk);
        System.out.println("En büyük index => " +indexEnBuyuk);
        System.out.println("En büyük eleman => " +eBuyukEleman);
        System.out.println("En küçük eleman => " +eKucukEleman);
        System.out.println();

        if (indexEnKucuk<indexEnBuyuk) {
            if (indexEnKucuk+1 == indexEnBuyuk) System.out.println("Aralarında eleman yoktur.");
            else {
                for (int i= indexEnKucuk+1; i<indexEnBuyuk; i++) {
                    System.out.print(list[i]+ " ");


                }
            }

        }else {
            if (indexEnBuyuk+1 == indexEnKucuk) System.out.println("Aralarında eleman yoktur.");
            else {
                for (int i= indexEnBuyuk+1; i<indexEnKucuk; i++) {
                    System.out.print(list[i]+ " ");

                }
            }

        }









    }
}
