package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task29 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Tam Sayı giriniz: ");
        int num = scanner.nextInt();

        boolean bb = powerOfThree(num);
        if (bb) {

            System.out.println(bb + " -- "+ num +" 3'ün üssü'dür.");

        }else {

            System.out.println(bb + " -- "+num +" 3'ün üssü değildir.");
        }



    }
    public static boolean powerOfThree(int num) {
        boolean flag = false;

        if (num % 3 == 0) {
            flag = true;


        }else {
            flag = false;

        }
        return flag;

    }






}
