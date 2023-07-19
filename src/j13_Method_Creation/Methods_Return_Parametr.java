package j13_Method_Creation;

public class Methods_Return_Parametr {

    public static void main(String[] args) {

        // return Type / parametreli
        // iki sayının farkını bize dönduren bir method cretate ediniz
        int sayi01 = 23;
        int sayi02 = 12;
        System.out.println(farkiBul(sayi01, sayi02));
        int frk = farkiBul(sayi01, sayi02);
        System.out.println(frk);

    }

    public static int farkiBul(int sayi01, int sayi02) {
        int fark = sayi01 -sayi02;
        return fark;
    }
}
