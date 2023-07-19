package j05_Ilk_Dort_Konu_Tekrar;

public class C01_Print_Yazdirma {
    public static void main(String[] args) {
        // Task1

        int sayi = 11;
        System.out.println("Sonuc: " + sayi+sayi);
        System.out.println(sayi*sayi);
        System.out.println(true && false||true);
        System.out.println(!true || false);
        System.out.println((sayi == 11) && (sayi>11) || sayi<11);
        System.out.println();
        System.out.println();


        // Task2

        char ch = 'A';
        System.out.println(ch);
        System.out.println(ch+1);
        System.out.println((char)(ch+2));

        double dd = sayi;
        System.out.println("dd= "+dd);

        byte bb = (byte) sayi;
        System.out.println("bb =" + bb);
        System.out.println();
        System.out.println();


        //Task3


        int x = 0;
        int sonuc = x++ + ++x + x;
        System.out.println("Sonuc: " + sonuc);
        System.out.println("x= " + x);

        String str = 7*5+ " gün";
        System.out.println("Str = " + str);

        int ss = 10; ss +=5; ss--; ss/= 7; ss*=2; ss-=4;
        System.out.println("ss = " + ss);
        System.out.println();
        System.out.println();





    }
}
