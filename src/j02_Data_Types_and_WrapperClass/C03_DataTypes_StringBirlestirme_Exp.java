package j02_Data_Types_and_WrapperClass;

public class C03_DataTypes_StringBirlestirme_Exp {
    public static void main(String[] args) {

        // String birleştirme işlemi yapıyoruz. String_Concenation denir buna
        // Birden çok String variable ile farklı data type  variable'ler + ile işleme alınırsa
        // java birleştirme yaparak yeni bir String oluşturur.
        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
        // işlem yapılıp String variable’a Concatenation yapılır.

        // Trick ->  String variable cok gucludur. Hangi data turu ile isleme girerse girsin kendine benzetir. -> ch+isim=1Haluk



        String str1 = "Hasan";
        String str2 = "Kamil";
        String str3 = str1+" "+str2; // Araya " " yaparak iki string arasına boşluk koyduk.
        String str4 = str2+str1; // Arada boşluk yok

        System.out.println(str3);
        System.out.println(str4);

        String s1 = "7";
        String ss = s1+s1;
        System.out.println("ss = "+ss); // s1 metin olarak 7 olduğu için ss toplam değil de yanyana 77 yazdırır.

        String str5 = str1+s1; //Mesela bunun çıktısında araya boşluk olmadan yazar.
        System.out.println(str5);

        int sayi = 9;
        String str6 = str5+sayi; // String ile başka tipte bir değişkeni + ile birleştirirsek, yeni bir string değeri oluşur.
        System.out.println(str6);

        double dd =3;
        str6 = str5+dd;
        System.out.println(str6);

        str6 = "" + sayi + dd;
        str5 = sayi+dd+"";

        System.out.println(str6); //Burda ilk önce string tipi olduğu için, yanına gelen sayi ve dd değerlerini toplamadan direk string gibi yazdı.
        System.out.println(str5); //Burda ilk önce toplama işlemi olduğu için (sayi+dd), önce toplamayı yaptı ve sonra bunu "" olduğu
                                    // için stringe çevirdi.







    }
}
