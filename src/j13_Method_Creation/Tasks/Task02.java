package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden
        // METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("AGAM adını   giresin : ");
        String  ad = input.nextLine();

        System.out.print("AGAM soyadını   giresin : ");
        String  soyad = input.nextLine();
        newString(ad,soyad);
        System.out.println("***************");
        System.out.println("Yeni isim ===> " + newName(ad,soyad));

    }//main sonu
    public static void newString (String ad, String soyad ){
        String name = ad.substring(0,1).toUpperCase()+ad.substring(1);
        String surname = soyad.substring(0,1).toUpperCase()+soyad.substring(1);
        System.out.println("Yeni isim ===> " + name+ " "+ surname);


    }
    public static String newName  (String ad, String soyad ){
        String name = ad.substring(0,1).toUpperCase()+ad.substring(1);
        String surname = soyad.substring(0,1).toUpperCase()+soyad.substring(1);
        return name +" "+ surname;


    }


}
