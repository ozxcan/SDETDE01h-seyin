package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        /* task->
            Fazla mesaiyi hesaplayan ve toplam kazancı return eden method create ediniz


            Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
            fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

            Örnek :
            saatlik çalışma ücreti : 40.0
            iş başı saati : 9.0
            paydos saati : 20.0
            fazla mesaiyi saat ücreti çarpanı: 1.8

            ucretHesapla(9.0,20.0,40.0,1.8);

            9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
            17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

            toplam = 536.0
           */

        Scanner sc = new Scanner(System.in);
        System.out.print("mesai başalama saatini yazınız : ");
        double start=sc.nextDouble();

        System.out.print("mesai bitis saatini yazınız : ");
        double finish=sc.nextDouble();

        System.out.print("mesai  saat ücretinizi yazınız : ");
        double saatUcret=sc.nextDouble();

        System.out.print("fazla mesai ucret katsaysını yazınız : ");
        double ucretKatsayisi=sc.nextDouble();

        double total = total(start,finish,saatUcret,ucretKatsayisi);
        System.out.println("Toplam ücretiniz = " + total);





    }//main sonu
    public static double total (double start, double finish, double saatUcret, double ucretKatsayisi) {

        double toplamKazanc = 0;
        if (finish - start == 8 || finish - start <=8) {
            double normalCalismaSaati = finish - start;
            toplamKazanc = normalCalismaSaati * saatUcret;


        }else {
            double mesaiCalismaSaati = finish -17;
            double normalCalismaSaati = finish - start-mesaiCalismaSaati;
            double calismaUcreti = normalCalismaSaati * saatUcret;
            double mesaiCalismaUcreti = mesaiCalismaSaati*40*ucretKatsayisi;
            toplamKazanc = calismaUcreti + mesaiCalismaUcreti;
        }
        return toplamKazanc;

    }





}//class sonu
