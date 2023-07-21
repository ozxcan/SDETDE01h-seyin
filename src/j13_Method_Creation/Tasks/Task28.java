package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task28 {
    /*
    task->
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Max Number: ");
        int max = scanner.nextInt();

        int rastgele = randomNum(max);
        System.out.println("Rastgele üretilen sayı => " + rastgele);

    }
    public static int randomNum(int max) {
        int rastgeleSayi = (int) (Math.random()*max);
        return rastgeleSayi;
    }



}
