package j07_Ternary_Konusu.Tasks;

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

        String sonuc = ( yas <= 4) ? "Bebek" : ((yas <= 12) ? "Cocuk" : ((yas <= 20) ? "Genc" : ((yas <= 30) ? "Yetiskin" : "Tanımlanmamıs evre")));
        System.out.println(sonuc);





    }
}