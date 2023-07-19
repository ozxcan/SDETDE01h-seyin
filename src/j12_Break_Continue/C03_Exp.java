package j12_Break_Continue;

public class C03_Exp {
    public static void main(String[] args) {
        /*
        TASK -------->
        Rastgele 1 ile 100 arasında 20 adet sayı üretilmektedir.
        10' a bölünemeyenleri print ediniz.
         */

        for (int i = 0; i < 20; i++) {
            int number = (int)(Math.random() * 100+1);
            if (number % 10 == 0) { // burda 10'a bölünebilen sayıları atlıyor, yazmıyor.
                continue;
            }
            System.out.print(number + " ");
        }
        System.out.println("******************");


        /*
        TASK -------->
        Rastgele 1 ile 100 arasında 20 adet sayı üretilmektedir.
        10' a bölünen bir sayı bulunuz
         */
        for (int i = 0; i < 20; i++) {
            int number = (int)(Math.random() * 100+1);
            if (number % 10 == 0) { // burda 10'a bölünen ilk sayıda döngüden çıkar.
                System.out.println();
                System.out.println("number = "+number);
                break;
            }
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Bitti");




    }
}
