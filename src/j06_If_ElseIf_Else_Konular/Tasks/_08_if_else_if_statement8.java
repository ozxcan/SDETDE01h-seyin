package j06_If_ElseIf_Else_Konular.Tasks;

public class _08_if_else_if_statement8 {

    public static void main(String[] args) {

        /*  33 değerinde bir int oluşturun.
            Eğer, 33'ü 4'e böldüğünüzde kalan 3'e eşit ise "Remainder is 3" yazdırınız.
            Eğer, 33'ü 4'e böldüğünüzde kalan 2'e eşit ise "Remainder is 2" yazdırınız.
            Eğer, 33'ü 4'e böldüğünüzde kalan 1'e eşit ise "Remainder is 1" yazdırınız.
            Aksi halde (else) "Reminder is 0" yazdırınız.  */

        int a = 36;

        if (a % 4 == 3) {
            System.out.println("Remainder is 3");
        } else if (a % 4 == 2) {
            System.out.println("Remainder is 2");
        } else if (a % 4 == 1) {
            System.out.println("Remainder is 1");
        } else {
            System.out.println("Remainder is 0");
        }

        // cozum 2
        {
            if (a % 4 == 3) {
                System.out.println("Remainder is 3");
            }
            if (a % 4 == 2) {
                System.out.println("Remainder is 2");
            }
            if (a % 4 == 1) {
                System.out.println("Remainder is 1");
            }
            if (a % 4 == 0) {
                System.out.println("Remainder is 0");
            }
        }
        // cozum 3
        System.out.println("Remainder is " +  (a%4) );

    }
}
