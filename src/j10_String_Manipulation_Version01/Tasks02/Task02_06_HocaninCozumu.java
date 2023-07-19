package j10_String_Manipulation_Version01.Tasks02;

import java.util.Scanner;

public class Task02_06_HocaninCozumu {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakterin
         yerine '*' koyup print ediniz
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String str = sc.next();
        System.out.print("istenen karakterin index'ini giriniz : ");
        int index=sc.nextInt();
        // input: sibel, 3, output: sib*l
        if (index >= 0 && index < str.length()) {
            str = str.substring(0,index)+"*"+str.substring(index+1);
        } else System.out.println("veriler uygun değil");
        System.out.println(str);
    }
}
