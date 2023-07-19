package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class _15_if_else_statement_with_logic_operators4 {

    public static void main(String[] args) {

        /*   String str oluşturulmuştur.
             Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
             Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
             Aksi halde (else) "no money" yazdırın.   */



        //Kodu aşağıya yazınız.
    //    if (str.contains("$"))  dolar işareti varmı kontrolu

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scan.nextLine();

        if (str.contains("$")) {
            System.out.println("This is dollar");

        }else if (str.contains("€")) {
            System.out.println("This is euro");

        }else {
            System.out.println("no money");

        }
    }
}
