package j13_Method_Creation.Sorular;

import java.util.Scanner;

public class S09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Write a Java method to display the middle character of a string.
            Note: a) If the length of the string is odd there will be one middle characters.
                 b) If the length of the string is even there will be two middle character.
                    Test Data:
                    Input a string: 350
                    Expected Output:

                    The middle character in the string: 5
         */

        String str = "350";
        String middle = middle(str);
        System.out.println(middle);
        // Dönen ortancı harf sayı ise +10 ekle ve yazdır.


    }
    public static String middle (String str) {
        String middle ="";
        if (str.length() % 2 == 0) {
            middle = middle + str.charAt((str.length()-1)/2)+str.charAt((str.length()-1)/2+1);
        }else {
            middle = middle + str.charAt((str.length()-1)/2);
        }
        return middle;
    }

}
