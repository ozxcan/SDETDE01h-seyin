package j11_Loops_Donguler.For_Loops.Hoca_Ornekler;

public class C09 {
    public static void main(String[] args) {
        // verilen stringi her satıra bir harf gelecek şekilde yazdırınız.
        String str = "Selamlar";

        // * yontem 1
        System.out.println();
        for (int i = 0; i <str.length() ; i++) {
             System.out.println(str.charAt(i));
        }

        // 2. yöntem
        System.out.println();
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.substring(i,i+1));
        }
    }
}
