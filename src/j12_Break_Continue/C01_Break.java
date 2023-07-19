package j12_Break_Continue;

public class C01_Break {
    public static void main(String[] args) {
        /*
        >>>>>> Break komutu, döngü içinde isteğidiğimiz bir şartı sağladıktan sonra döngünün iptal olmasını
        istiyorsak,o şartın altına direk break yazarız ve döngüden çıkarız.
         */

        int n = 20;
        for (int i = 1; i < n; i++) {
            if (i % 7 == 0) {
                break; // i 7'ye tam bölündüğü anda break ile döngüden çıkar.

            }
            System.out.print(i + " ");

        }




    }
}
