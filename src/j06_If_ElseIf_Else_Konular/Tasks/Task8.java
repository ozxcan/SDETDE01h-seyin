package j06_If_ElseIf_Else_Konular.Tasks;

public class Task8 {
    public static void main(String[] args) {
        /*  33 değerinde bir int oluşturun.
    Eğer, 33'ü 4'e böldüğünüzde kalan 3'e eşit ise "Remainder is 3" yazdırınız.
    Eğer, 33'ü 4'e böldüğünüzde kalan 2'e eşit ise "Remainder is 2" yazdırınız.
    Eğer, 33'ü 4'e böldüğünüzde kalan 1'e eşit ise "Remainder is 1" yazdırınız.
    Aksi halde (else) "Reminder is 0" yazdırınız.  */

        int a = 33;

        if (a % 4 == 3) {
            System.out.println("Kalan 3'tür.");

        } else if (a % 4 == 2) {
            System.out.println("Kalan 2'dir.");

        } else if (a % 4 == 1) {
            System.out.println("Kalan 1'dir.");

        } else {
            System.out.println("Kalan 0'dir.");
        }
        System.out.println();
        System.out.println("***** Diğer Çözüme Bak*****");
        System.out.println();
        // Diğer bir yöntemle çözelim...
        if (a % 4 == 3) {
            System.out.println("Kalan 3'tür.");

        }
        if (a % 4 == 2) {
            System.out.println("Kalan 2'dir.");

        }
        if (a % 4 == 1) {
            System.out.println("Kalan 1'dir.");

        }
        if (a % 4 == 0){
            System.out.println("Kalan 0'dir.");
        }
        System.out.println();
        System.out.println("***** Diğer Çözüme Bak*****");
        System.out.println();
        // Diğer bir yöntemle çözelim...

        System.out.println("Kalan eşittir " + (a % 4)); // a nın mod 4 her zaman kalanı verdiği için direk bunu
                                                    // yazmak  en kolayıdır.


    }
}
