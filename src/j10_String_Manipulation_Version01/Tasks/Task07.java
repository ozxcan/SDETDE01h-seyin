package j10_String_Manipulation_Version01.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */


        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.nextLine();

        System.out.print("istenen karakterin index'ini giriniz : ");
        int index=sc.nextInt();

        System.out.println(str.charAt(index));

        // CÖZÜM 2

        System.out.println(str.substring(index,index+1));





    }
}
