package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task23 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> vucüt kitleendexini print eden METHOD create ediniz
        vki->kg(mt*mt)
     18,5 kg/m2 ve daha düşük değerler = Zayıf.
     18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
     25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
     30,0 ve üstü =  obezite.

         */
        System.out.print("Boyunuzu mt olarak girin: ");
        double boy = input.nextDouble();
        System.out.print("Kilonunuz kg olarak girin: ");
        int kilo = input.nextInt();

        String boyKilo = oran(boy,kilo);
        System.out.println("Vücut kitle endeksi ==> " + boyKilo);




    }//main sonu
    public static String oran (double a, int b) {
        double index =  b /(a*a);
        String sonuc="";
        if ( index >= 30) sonuc="Obezite";
        else if(index >=25) sonuc="Kilolu";
        else if (index > 18.5) sonuc="Normal ağırlıkta";
        else sonuc="Zayıf";
        return sonuc;
    }



}
