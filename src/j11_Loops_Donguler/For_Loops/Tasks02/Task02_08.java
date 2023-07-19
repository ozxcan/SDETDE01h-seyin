package j11_Loops_Donguler.For_Loops.Tasks02;

public class Task02_08 {
    public static void main(String[] args) {
        // Bir string veriliyor, for kullanarak her harf arasına bir boşluk gelecek  şekilde yazdırın
        String str = "Selamlar";

        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + " ");
        }

    }
}
