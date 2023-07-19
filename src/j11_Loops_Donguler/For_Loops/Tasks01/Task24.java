package j11_Loops_Donguler.For_Loops.Tasks01;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */


        Scanner input = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = input.nextLine();

        String ters = "";
        for (int i =str.length()-1; i>=0; i--) {
            ters += str.charAt(i);
        }
        System.out.println(ters);



    }

}
