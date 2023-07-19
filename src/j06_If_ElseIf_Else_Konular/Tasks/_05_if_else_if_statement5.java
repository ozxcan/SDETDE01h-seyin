package j06_If_ElseIf_Else_Konular.Tasks;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Birinci sayı ? :");
//        double number = scan.nextDouble();
//        System.out.print("İkinci  sayı ? :");
//        double number2 = scan.nextDouble();

        double dB1 = 90.25;
        double dB2 = 90.25;

        if (dB1 > dB2) {
            System.out.println("Hello World");

        }else if (dB1 < dB2) {
            System.out.println("Not Hello World");

        }else {
            System.out.println("I love Java");
        }





    }
}
