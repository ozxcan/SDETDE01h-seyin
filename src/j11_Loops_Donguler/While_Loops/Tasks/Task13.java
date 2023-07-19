package j11_Loops_Donguler.While_Loops.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde ise
        "javaTAR" print eden code create ediniz. (javaTar yaz ve çık)
        do-while lopp
         */
        Scanner scan = new Scanner(System.in);

        char ch = 0;
        while (ch!= 'x') {

            System.out.print("Bir karakter girin: ");
            ch = scan.next().toLowerCase().charAt(0);
            if (ch=='x') System.out.println("javaTAR");
            else System.out.println("JavaCAN");
        }


        System.out.println();
        System.out.println("---------------------------");

        // do while ile yapalım

        do {

            System.out.print("Bir karakter girin: ");
            ch = scan.next().toLowerCase().charAt(0);

            if (ch=='x') System.out.println("javaTAR");
            else System.out.println("JavaCAN");

        }while (ch!= 'x');
        System.out.println();
        System.out.println("---------------------------");


        // for ile yapalım

        int max = Integer.MAX_VALUE;
        for (int i =0; i<max; i++) {

            System.out.print("Bir karakter girin: ");
            ch = scan.next().toLowerCase().charAt(0);

            if (ch !='x') System.out.println("JavaCAN");
            else System.out.println("javaTAR");break;

        }
        System.out.println("---------------------------");







    }
}
