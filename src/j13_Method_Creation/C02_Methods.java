package j13_Method_Creation;

public class C02_Methods {
    public static void main(String[] args) {
        /*
        TASK >>>
        10 adet sayı üretiniz ve çift sayıların toplamını ekranan yazdırınız.
        Bunu metot kullanarak yapın. topla adında metot oluştur.
         */
        // normal for ile yapalım.

        int toplam = 0;
        for (int i = 1; i < 10; i++) {
            int number = (int) (Math.random() * 100+1);
            System.out.print(number + " ");
            if (number % 2 == 0) {
                toplam += number;
            }

        }
        System.out.println();
        System.out.println("Toplam " + toplam);
        System.out.println("------------------------------");

        // metot çağırma ile yapalım.

        System.out.println("Metot ile toplam: "+toplam);








    }
    public static int topla () {
        int toplam = 0;
        for (int i = 1; i < 10; i++) {
            int number = (int) (Math.random() * 100+1);
            System.out.print(number + " ");
            if (number % 2 == 0) {
                toplam += number;
            }

        }return toplam;
    }


}
