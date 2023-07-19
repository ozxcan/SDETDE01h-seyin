package j13_Method_Creation;

public class Methods_Void_Parametr {
    public static void main(String[] args) {

        // 2. parametreli / void bir method
        // 2 sayının toplamını yazdıran methodu yapalım
        int sayi01 = 5;
        int sayi02 = 10;
        ikiSayiyTopla(sayi01, sayi02);


    } //main sonu

    public static void ikiSayiyTopla(int a, int b) {
        int toplam = a + b;
        System.out.println(toplam);

    }


}// class
