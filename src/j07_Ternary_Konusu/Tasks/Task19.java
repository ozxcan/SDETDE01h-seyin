package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task19 {

    /*
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
    Doğum Tarihi %12 = 0 ➜ Maymun
    Doğum Tarihi %12 = 1 ➜ Horoz
    Doğum Tarihi %12 = 2 ➜ Köpek
    Doğum Tarihi %12 = 3 ➜ Domuz
    Doğum Tarihi %12 = 4 ➜ Fare
    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen Doğum Tarihinizi Giriniz : ");
        int dY = scan.nextInt();

        int burc = dY % 12;

        if (burc == 0 ) System.out.println("Burcunuz Maymun'dur");
        if (burc == 1 ) System.out.println("Burcunuz Horoz'dur");
        if (burc == 2 ) System.out.println("Burcunuz Köpek'dir");
        if (burc == 3 ) System.out.println("Burcunuz Domuz'dur");
        if (burc == 4 ) System.out.println("Burcunuz Fare'dir");
        if (burc == 5 ) System.out.println("Burcunuz Öküz'dür");
        if (burc == 6 ) System.out.println("Burcunuz Kaplan'dır");
        if (burc == 7 ) System.out.println("Burcunuz Tavşan'dır");
        if (burc == 8 ) System.out.println("Burcunuz Ejderha'dır");
        if (burc == 9 ) System.out.println("Burcunuz Yılan'dır");
        if (burc == 10 ) System.out.println("Burcunuz At'dır");
        if (burc == 11 ) System.out.println("Burcunuz Koyun'dur");



    }
}
