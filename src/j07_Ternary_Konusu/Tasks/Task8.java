package j07_Ternary_Konusu.Tasks;

public class Task8 {
    public static void main(String[] args) {
        /*  33 değerinde bir int oluşturun.
    Eğer, 33'ü 4'e böldüğünüzde kalan 3'e eşit ise "Remainder is 3" yazdırınız.
    Eğer, 33'ü 4'e böldüğünüzde kalan 2'e eşit ise "Remainder is 2" yazdırınız.
    Eğer, 33'ü 4'e böldüğünüzde kalan 1'e eşit ise "Remainder is 1" yazdırınız.
    Aksi halde (else) "Reminder is 0" yazdırınız.  */

        int a = 33;

        String sbr = (a % 4 == 3) ? "Remainder is 3" : (a % 4 == 2) ? "Remainder is 2" : (a % 4 == 1) ? "Remainder is 1" : "Remainder is 0";
        System.out.println(sbr);





    }
}
