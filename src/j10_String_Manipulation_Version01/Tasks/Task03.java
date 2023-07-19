package j10_String_Manipulation_Version01.Tasks;

public class Task03 {
    public static void main(String[] args) {
        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini return eden code create ediniz


        String str = "alamanya";

        // Cözüm 1
        // 1'inci a yı bulup yıldıza çevirelim. (*lamanya)
        // sonra yine birinici a yı bulalım. Bu aslında ikinci a olmuş olur.

        String ilkA = str.replaceFirst("a","*");
        int a = ilkA.indexOf("a");
        System.out.println(ilkA);
        System.out.println(a);

        /*
        Çözüm 2
        str.indexOf("a", fromindex) kullanarak çözelim.
         */

        //ilk önce ilk a nın indexini bulurum.

        int iA = str.indexOf("a");

        // İlk a nın indeksini kullanarak, bundan sonraki gelecek a nın indeksini aşağıdaki gibi buluruz.

        int ikinciA = str.indexOf("a" , iA+1);
        System.out.println(ikinciA);

        // Bu şekilde üçüncü ve dördüncü a nın indeksini de bulabiliriz.







    }
}
