package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            input:1453
            output:3541

         */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int tersNum= reverse(num);
        System.out.println("Tersten yazılınca ==> " + tersNum);

    }
    public static int reverse (int num) {
        String str = String.valueOf(num);
        String newStr="";
        for (int i = str.length()-1; i >= 0; i--) {
            newStr = newStr+str.charAt(i);
        }
        int tersNum = Integer.parseInt(newStr);
        return tersNum;

    }

}

