package j11_Loops_Donguler.For_Loops.Tasks01;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.
        örnek "1 ala 1"
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("bir metin  giriniz : ");
        String str = sc.nextLine();

        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+= str.charAt(i);
        }
        if (str.equalsIgnoreCase(tersStr)) {
            System.out.println("Girilen ifade polindromedir.");

        }else {
            System.out.println("Girilen ifade polindrome değildir.");
        }




    }

}





