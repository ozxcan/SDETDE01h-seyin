package j13_Method_Creation.Sorular;

public class S11 {
    public static void main(String[] args) {
        /*
        Write a Java method to count all the words in a string.
            Test Data:
            Input the string: The quick brown fox jumps over the lazy dog.
            Expected Output:

            Number of words in the string: 9
            kelime = boşluk +1;

         */
        String str =" The quick brown fox jumps over the lazy dog. ";
        bosluk(str);



    }
    public static void bosluk(String str) {
        String bosluk = str.trim();
        bosluk = bosluk.replaceAll("\\S", "");
        int boslukSayisi = bosluk.length()+1;
        System.out.println("Kelime sayısı " + boslukSayisi);

    }
}
