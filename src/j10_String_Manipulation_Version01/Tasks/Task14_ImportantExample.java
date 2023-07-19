package j10_String_Manipulation_Version01.Tasks;

public class Task14_ImportantExample {
    public static void main(String[] args) {
        /* Harflerden oluşan bir stringin içindeki tüm "a" leri, "e" ve
        tüm "e" leri "a" yapınız
         */

        String s = "evlerinin Taşları";
        String b = s.replace ("e", "*");
        System.out.println(b);
        System.out.println();
        String c = b.replace("a", "e");
        System.out.println(c);
        System.out.println();
        String d = c.replace("*" , "a");
        System.out.println("A lar E olmuş şekilde \n"+d);




    }
}
