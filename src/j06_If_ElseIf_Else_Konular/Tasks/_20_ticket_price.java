package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Task->
        Trafik cezasının değerini hesaplayın code create ediniz
45 hız sınırıdır.

Eğer hızınız 55-74 arasında ise:
Ceza 100 $'dır.

Eğer hızınız 75 - 84 arasında ise:
Ceza 150 $'dır.

Eğer hızınız 85 -94 arasında ise:
Ceza 320 $'dır.

Eğer hızınız 94'den daha fazla ise:
Ceza 500 $'dır.

ve ayrıca,
Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */


//Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        Scanner scan = new Scanner(System.in);
        System.out.print("Hiz değerini giriniz: ");

        int hiz = scan.nextInt();
        System.out.print("Ehliyetiniz var mı? True/False: ");

        boolean isDriverLicenceAvailable = scan.nextBoolean();

        if (hiz >= 55 && hiz <= 74) {
            if (isDriverLicenceAvailable == true) {
                System.out.println("Cezanız 100 $'dır.");

            } else {
                System.out.println("Cezanız 300 $'dır.");
            }
        }
        if (hiz >= 75 && hiz <= 84) {
            if (isDriverLicenceAvailable == true) {
                System.out.println("Cezanız 150 $'dır.");

            } else {
                System.out.println("Cezanız 350 $'dır.");

            }
        }
        if (hiz >= 85 && hiz <= 94) {
            if (isDriverLicenceAvailable == true) {
                System.out.println("Cezanız 320 $'dır.");

            } else {
                System.out.println("Cezanız 520 $'dır.");

            }
        }
        if (hiz >= 95) {
            if (isDriverLicenceAvailable == true) {
                System.out.println("Cezanız 500 $'dır.");

            } else {
                System.out.println("Cezanız 700 $'dır.");

            }


        }
    }
}


