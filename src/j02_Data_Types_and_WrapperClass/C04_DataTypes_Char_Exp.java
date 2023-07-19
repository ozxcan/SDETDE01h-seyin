package j02_Data_Types_and_WrapperClass;

public class C04_DataTypes_Char_Exp {

    public static void main(String[] args) {

         /*
        Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
             Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
        Note: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi ii)Birlestirme Islemi(Concatenation)
              Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.
     */

        char ch1= 'A';
        char ch2 = 'C';
        System.out.println(ch1+ch2); //Char da araya matematiksel işlem sokarsak, ASCII tablosundaki değeri yazdırır.
        //ASCII

        System.out.println((ch1)); //Matematiksel işlemi araya sokmazsak, sadece tırnak içerisindeki değeri yazar.
        System.out.println(ch1+0);
        System.out.println('?'+0);
        System.out.println('?');
        System.out.println('-');
        System.out.println('-'+0);
        System.out.println('x'); //Burda sadece x harfini yazdırır.
        System.out.println('x'+25); //Burda araya matematiksel işlem girdiği için x'in ASCII değeri ile 25 i toplar.



        // ASCII tablo oluşturalım (konu dışı)
//        char cc = '?';
//        for (int i = 0; i <255;i++) {
//            System.out.println((char) (i));
//            if (i % 24 == 0) System.out.println();
//            else System.out.println(" ");
//        }










    }
}
