package j11_Loops_Donguler.For_Loops.Tasks01;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını(harfin kaç adet olduğunu) print eden code create ediniz


        input : selam javaCAN'lar
        output : a sayısı :3
         */
        Scanner input = new Scanner(System.in);
        System.out.print("agam bir ifade giresen : ");
        String str = input.nextLine();//javacan

        System.out.print("agam hangi harfi saydıracaksın :");
        char harf=input.next().charAt(0);//a

        int harfA=0;

        for( int i=0; i<str.length(); i++) {
            if(str.charAt(i) == harf) {
                harfA++;
            }
        }
        System.out.println(harfA);

        // Çözüm 2

//        harfA = str.length() - str.replace(""+str.charAt(), harf).length();
//        System.out.println(harfA);


    }
}
