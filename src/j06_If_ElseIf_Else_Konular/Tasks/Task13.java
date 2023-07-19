package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */
        Scanner input = new Scanner(System.in);
        System.out.print("agam 1. sayı  giresen : ");
        int sayi1 = input.nextInt();
        System.out.print("agam 2. sayı  giresen : ");
        int sayi2 = input.nextInt();

        System.out.println("Lütfen bir işlem seçiniz : \nToplama için T'ye\nÇıkarma için C'ye\nÇarpma için Ç'ye\nBölme için B'ye basınız.");
        char islem = input.next().charAt(0);

        if (islem == 'T') {
            System.out.println(sayi1 + sayi2);

        }else if (islem == 'C') {
            System.out.println(sayi1 - sayi2);

        }else if (islem == 'Ç') {
            System.out.println(sayi1*sayi2);

        }else if (islem == 'B') {
            System.out.println(sayi1*1.0/sayi2);

        }else {
            System.out.println("Yanlış işlem seçtiniz. Tekrar deneyiniz.");
        }






    }
}
