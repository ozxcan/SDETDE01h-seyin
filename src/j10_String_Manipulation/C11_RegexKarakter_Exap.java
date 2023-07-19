package j10_String_Manipulation;

public class C11_RegexKarakter_Exap {
    public static void main(String[] args) {

        /*
        ORNEK:
        Bir tarih string olarak verliyor, bir sonraki günün tarihini yazdırınız.
        Tüm aylar 30 gün olarak değerlendir, yıl aşımını dikkate alma.
        input = "20/11/2022" , 30/11/2022
        output = "21/11/2022" , 01/12/2022
         */


        String str = "20/11/2022";

        String a = str.substring(0,2); // önce günü kopardım.
        int gun = Integer.parseInt(a)+1; // Sonra günü integer'a çevirdim ve bir artırdır.
        String b = String.valueOf(gun); // Sonra integer olan günü tekrar String'e döndürdüm
        System.out.println(b+str.substring(2));




    }
}
