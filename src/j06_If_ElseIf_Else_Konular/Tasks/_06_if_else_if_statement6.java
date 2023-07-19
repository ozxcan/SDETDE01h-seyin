package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class _06_if_else_if_statement6 {

    public static void main(String[] args) {

        /*      Altta int number klavyeden girilerek oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */


        //Kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if (number == 0) {
            System.out.println("I am neutral");

        }else if (number > 0) {
            System.out.println("I am positive");

        }else {
            System.out.println("I am negative");
        }

    }
}
