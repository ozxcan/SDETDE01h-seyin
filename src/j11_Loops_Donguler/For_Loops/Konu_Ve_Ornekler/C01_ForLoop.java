package j11_Loops_Donguler.For_Loops.Konu_Ve_Ornekler;

public class C01_ForLoop {
    public static void main(String[] args) {

        /*
        FOR DÖNGÜSÜ - bir grup içerisindeki her öğeyi yazdırır.
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " +i);
        }
        System.out.println("*** SPACE ***");
        /*
        Yukarıda önce i yi sıfır alır, sonra döngüye girer.
        sonra gelir i yi bir artırır ve yine döngüye girerek yazdırı.
        Taa ki i < 10 şartı sağlamaz ise for döngüden çıkar.
         */

        // ÖRNEK

        int toplam = 0;
        for (int i = 0; i < 10; i++) { // for içinde tanımlanmış bir variable for body dışında geçerli değildir.
            toplam = toplam+i;          // yani i sadece for içinde geçerli.

            System.out.println("İ=  " + i + "     Toplam = " + toplam);
        }
        System.out.println("Genel toplam : " + toplam);
        System.out.println("FOR'dan çıktı");
        //System.out.println(i);  hata verir. çünkü i sadece for içinde tanımlanmış. O yüzden sadece for içinde yazdırılması lazım.





    }
}
