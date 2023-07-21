package j13_Method_Creation;

public class Hoca03_Method_Overloading {

    public static void main(String[] args) {
        /*

       code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
       main method'a call edip run etmek uygulamanın test edilmesi maintanance ve reusable açısından tercih edilir.
       1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
       a)method adı  b)parametre sayisi, c)parametre'lerin data tiplerin ve d)parametrelerin sırası methodu belirler.

       str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                             bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                             bana rapor olarak ne getirdigini bilmem lazim (true/false)

       2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

       3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
          de oldugu gibi
          disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
          deklare edilmeli

          method call edildiğinde  Parametre olarak
          declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.

         */

        /*
         Java'da  methodlarin farkli  olmaları  icin
              a)Method ismi  b)parametreler kontrol edilir..

         Java da ayni isimle birden çok method create edilmesine method overloading denir.
        method Overloading icin Method Signature'larinin farkli olmasi gerekir
         Method Signature = method name + parametre sayisi + parametre data type

        ahan da TRICK_01 : Access Modifier'lari degistirmek de method'lari Java  farkli methodlar olarak derlemez
         aynı method olarak derler   Cunku access modifier'lar method signature'a dahil degildir.
        ahan da TRICK_02 : Method'larin body'sini degistirmek de method'lari Java  farkli methodlar olarak derlemez
         aynı method olarak derler. Cunku body'ler method signature'a dahil degildir.
        ahan da TRICK_03 : Overloading "Compile Time Error" verir.

        Overloading :
        1)Parametrelerin sayisi degistirilerek method overloading tanımlanabilir.
        2)Parametre sayisi değiştirilmeden herhangi bir parametrenin data type'ini
          degistirerek method overloading tanımlanabilir.
        Note: topla(2,3); method call topla(double num1, int num2) var oldugu surece
              topla(int num1, int num2) yi kullanir, cunku argument data type ile parametre
              data type birebir eşleşiyor. Fakat argument data type ile parametre
              data type birebir eşleşmeyen data type yoksa auto widening'e
              gore Java kullanacagi method'u secilir. Auto widening'e gore kullanabilecegi bir method
              yoksa Java hata verir.
        3)FARKLI data type'indeki parametrelerin yerlerini degistirerek method overloading tanımlanabilir.
         birbirini kapsayan data turleri oldugunda Java en optimum cozumu tercih eder.
         (bire bir uyan varsa o methodu calistirir, bire bir uyan yoksa en fazla uyan
         methodu kullanir)
         Eger kapsayan bir method da bulamazsa Java CTE verir


        */

    }

}
