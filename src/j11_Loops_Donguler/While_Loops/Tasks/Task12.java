package j11_Loops_Donguler.While_Loops.Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
        Scanner input = new Scanner(System.in);
        System.out.print("Agam bir metin giresen : ");
        String str = input.nextLine().toLowerCase();//girilen str değeri kuck harfe atandı

        int i = 0;
        int rakam =0;
        int harf = 0;
        int ozel =0;

        while (i < str.length()) {
            if (Character.isAlphabetic(str.charAt(i))) harf++;
            else if (Character.isDigit(str.charAt(i))) rakam++;
            else ozel++;

        }
        System.out.println("Harflerin sayısı " + harf);
        System.out.println("Rakamların sayısı " + rakam);
        System.out.println("Ozel karakterlerin sayısı " + ozel);











    }

}
