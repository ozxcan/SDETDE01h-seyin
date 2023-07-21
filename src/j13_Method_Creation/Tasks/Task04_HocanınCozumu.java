package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task04_HocanınCozumu {//amale köyden ırgat çağıran şeher
    /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
         */


    public static void main(String[] args) {
        int bakiye = 1000;
        menu(bakiye);
    }//main dışı

    private static void menu(int bakiye) {
        System.out.println("\n\n\n");
        System.out.println("   ***   ");
        System.out.println("  ***   ATM'ye hoş Geldiniz  ***  ");
        System.out.println("   ***   ");
        System.out.print("MÖNÜÜÜ :-)\nBakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
        Scanner scanner = new Scanner(System.in);
        String secim = scanner.next().substring(0,1);
        switch (secim) {
            case "1" : bayiyeDisplay(bakiye); break;
            case "2" : bakiye = depositMoney(bakiye); break;
            case "3" : bakiye = withDrowMoney(bakiye); break;
            case "4" : return;
            default:
                System.out.println("hatalı seçim");break;
        }
        menu(bakiye);
        System.out.println("metot bitti");
    }

       private static int withDrowMoney(int bakiye) { //
           System.out.print("Çekilecek para Miktarı ? : ");
           Scanner scanner = new Scanner(System.in);
           int cekilenMiktar = scanner.nextInt();
           if (cekilenMiktar>bakiye) {
               System.out.println("Bu kadar para mevcut değil ");
           }
           return bakiye-cekilenMiktar;
    }

    private static int depositMoney(int bakiye) {
        System.out.print("Yatırılacak Miktar? : ");
        Scanner scanner = new Scanner(System.in);
        int yatanMiktar = scanner.nextInt();

        return bakiye+yatanMiktar;
    }

    private static void bayiyeDisplay(int bakiye) {
        System.out.println("Bakiye = "+ bakiye);
    }


}
