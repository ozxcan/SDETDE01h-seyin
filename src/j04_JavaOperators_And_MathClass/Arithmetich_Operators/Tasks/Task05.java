package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        /*
    Task->
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

        Scanner input = new Scanner(System.in);
        System.out.print("Saat olarak bir değer giriniz: ");
        int saat = input.nextInt();
        System.out.print("Dakika olarak bir değer giriniz: ");
        int dakika = input.nextInt();
        System.out.print("Saniye olarak bir değer giriniz: ");
        int saniye = input.nextInt();


        int s = (3600 * saat) + (60 * dakika)+ saniye;

        System.out.println("Toplam olarak " + s + " saniye yapar.");



    }





}



























