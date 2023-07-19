package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Task->
        Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */

        Scanner input = new Scanner(System.in);
        System.out.print("Agam vize notu giresen : ");
        int vizeNot = input.nextInt();

        System.out.print("Agam ara sınav notu giresen : ");
        int araSinavNot = input.nextInt();

        System.out.print("Agam final notu giresen : ");
        int finalNot = input.nextInt();

        //Ortalama hesabı
        int notOrt = (int) Math.round((vizeNot + araSinavNot + finalNot) / 3.0);

        if (notOrt >= 90) {
            System.out.println("Notunuz A'dir");

        } else if (notOrt >= 70) {
            System.out.println("Notunuz B'dir");

        } else if (notOrt >= 50) {
            System.out.println("Notunuz C'dir");
        } else {
            System.out.println("Notunuz F'dir");
        }
//      ****** IKINCI YONTEM **********
        System.out.println(" ********* IKINCI YONTEM ********** ");


        if (notOrt >= 90) {
            System.out.println("Notunuz A'dir");

        }
        if (notOrt >= 70 && notOrt < 90) {
            System.out.println("Notunuz B'dir");

        }
        if (notOrt >= 50 && notOrt < 70) {
            System.out.println("Notunuz C'dir");
        }
        if (notOrt < 50) {
            System.out.println("Notunuz F'dir");
        }



    }
}
