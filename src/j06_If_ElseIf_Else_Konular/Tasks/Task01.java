package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
         Task->
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
        0 - 4 => bebek
        5 - 12 => cocuk
        13 - 20 => genc
        21 - 30 => yetiskin
        Tanimlanmamis evre
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz: ");
        int yas = input.nextInt();

        if (yas >= 0){
            if ( yas < 5) {
                System.out.println("Bebek");
            }else {
                if (yas < 13) {
                    System.out.println("Cocuk");
                }else {
                    if (yas < 21) {
                        System.out.println("Genc");
                    }else {
                        if (yas < 30) {
                            System.out.println("Yetiskin");
                        }else {
                            System.out.println("Tanımlanmamıs evre");
                        }
                    }
                }
            }
        }else {
            System.out.println("Yaş negatif olamaz.");
        }




    }
}