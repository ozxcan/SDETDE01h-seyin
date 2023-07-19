package j10_String_Manipulation;

public class C03_With_StrLength {
    public static void main(String[] args) {

        /*
        Verilen bir string'in kaç karakterden oluştuğunu, yani
        uzunluğunu bulmak için kullanılır.
         */

        String str = "Java bizi çok seviyor.";
        System.out.println(str.length());
        System.out.println();


        // Örnek Stirng içinde boşluktan sonra kaç karakter vardır?
        String str3 ="Faruk Kadı";

        int num = (str3.length()) -1 - str3.indexOf(" ");
        System.out.println(num);
        System.out.println();


        /* Örnek; Verilen stringin ortadaki karakterini print ediniz?
        Stringin uzunluğunun ikiye böleriz ve bu ortadaki karakteri charAt()
        ile yazdırırız.
         */


        String str4 = "Faruk Kadılara"; // Bunun ortanca karakteri
        System.out.println(str4.charAt(str4.length()/2)+ " ortanca karakterdir.");
        System.out.println();

        // Örnek
        // Aşağıdaki string in uzunluğu kaç karakterdir.

        String mmm = "Bugün hava çok güzel";
        System.out.println(mmm.length()+ " karakterden oluşur.");
        System.out.println();





    }
}
