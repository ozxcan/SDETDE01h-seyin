package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task11 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /* task-> girilen ifadeyi 'hacker' dilinde print eden METHOD create ediniz
        String içindeki
        a->7
        v->1
        c->-4
        e->2 'ye replace ile çevir.
         */
        System.out.print("Bir karakter gir: ");
        String ch = input.next().toLowerCase();

        int result = result(ch);
        System.out.println(result);

    }//main sonu
    public static int result (String ch) {
        int sonuc;
        switch (ch) {
            case "a": sonuc= 7; break;
            case "v": sonuc= 1; break;
            case "c": sonuc= 4; break;
            case "e": sonuc= 2; break;
            default:sonuc=0;break;

        }
        return sonuc;
    }




}
