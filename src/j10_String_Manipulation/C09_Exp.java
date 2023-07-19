package j10_String_Manipulation;

public class C09_Exp {
    public static void main(String[] args) {
        /*
        Verilen String tümü ile büyük harflerden veya küçük harflerden oluşmaktadır. Harfler
        büyük mü yoksa küçük mü belirtiniz.

         */
        String str1 = "ALUKAKENEMAN";
        String str2 = str1.toUpperCase();

        if (str1.equals(str2)) System.out.println("Str1 Büyük harflerden oluşmaktadır.");
        else System.out.println("Küçük harflerden oluşmaktadır.");




    }
}
