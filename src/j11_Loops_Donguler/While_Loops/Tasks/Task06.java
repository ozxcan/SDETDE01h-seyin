package j11_Loops_Donguler.While_Loops.Tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        1 ile 100 arasında pc'nin atadığı tam sayıyı kullanıcıya tahmin ettirip
        tahmin  sayısını print eden bir code yazınız.

         */


        Scanner scan = new Scanner(System.in);
        int numberOfPc = (int) (Math.random()*100+1); // bilgisayar burda 1 ile 100 (dahiller) sayı tutuyor .
        int counter = 0;
        int tahminEttigimSayi = 0;
        while (tahminEttigimSayi != numberOfPc) {
            counter++;
            System.out.print(counter+ " . tahmini gir :"); // burda ben tahminimi giriyorum.
            tahminEttigimSayi = scan.nextInt();
            if (tahminEttigimSayi > numberOfPc) System.out.println("Daha küçük bir sayı tahminde ediniz.");
            else if (tahminEttigimSayi < numberOfPc) System.out.println("Daha büyük bir sayı tahminde ediniz.");

        }
        System.out.println("Tebrikler" +counter+" . tahminde bildiniz");














    }




}
