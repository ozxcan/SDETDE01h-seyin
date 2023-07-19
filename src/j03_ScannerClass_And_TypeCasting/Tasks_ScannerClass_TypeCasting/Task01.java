package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        Scanner scan = new Scanner(System.in);

        System.out.print("Vize notunuz: ");
        int vize = scan.nextInt();

        System.out.print("Final notunuz: ");
        int finall = scan.nextInt();

        System.out.print("Proje notunuz: ");
        int proje = scan.nextInt();

        double ortalama = (int) ((vize*30)/100 + (finall*50)/100 + (proje*20)/100);
        System.out.println("Your grade is : " + ortalama);








    }
}
