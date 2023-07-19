package j10_String_Manipulation_Version01.Tasks03_Regex_Kullanimi;

public class Task03_02 {
    public static void main(String[] args) {
        // Bir tarih string olarak veriliyor , bir sonraki günün tarihini yazdırınız
        // tüm aylar 30 gün olarak düşünün, ( yıl aşımını dikkate almayın 3.kademe)  (
        // input = "20/11/2022" , input 2 : "30/11/2022"
        // output= "21/11/2022" , output 2: "01/12/2022"


        String str = "20/11/2022";

        String a = str.substring(0, 2); // önce günü kopardım.
        int gun = Integer.parseInt(a) + 1; // Sonra günü integer'aa çevirdim ve bir artırdır.
        String b = String.valueOf(gun); // Sonra integer olan günü tekrar String'e döndürdüm
        System.out.println(b + str.substring(2));

        String cc = "30/11/2022";
        String guN = cc.substring(0,2);
        String day = String.valueOf(Integer.parseInt(guN)+1); // Günü Integer'a çevirdim, bir artırıp tekrar String yaptım.
        String ay = cc.substring(3,5);
        String month = String.valueOf(Integer.parseInt(ay)+1);
        String newDate = day + cc.substring(2,3)+month+cc.substring(5);
        System.out.println(newDate); // 01/12/2022 şeklinde sonuc vermeli.

         // --->  CÖZÜM 2

        String aa = "20";
        int sayi = Integer.valueOf(aa) + 1;
        System.out.println("" + sayi);
    }
}
