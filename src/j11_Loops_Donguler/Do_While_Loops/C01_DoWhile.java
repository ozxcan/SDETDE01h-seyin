package j11_Loops_Donguler.Do_While_Loops;

public class C01_DoWhile {
    public static void main(String[] args) {
        /*
        Do 'nun while döngüsünden tek farkı, do 'da önce işlemi yapar,
        sonra sorgusunu yapar şarta uyuyor mu uymuyor mu diye.
         */

        // 1 den 10 a kadar sayıları ekrana yazdıralım.

        int i = 0;

        do {
            i++;
            System.out.print(i+ " "); // Burda mesela i 10 iken normalde i < 10 şartını sağlamıyor ama
                                    // do ile önce işlemi yapıyor, yazdırıyor, sonra şartı sorguluyor.
                                    // bu yüzden i 10 olduğunda da yazdırıyor.

        }while (i < 10); // şartı burda sorguluyor.












    }
}
