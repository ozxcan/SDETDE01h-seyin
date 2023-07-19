package j12_Break_Continue;

public class C02_Continue {
    public static void main(String[] args) {
        /*
        >>>>>> Continue komutu, döngü içinde isteğidiğimiz bir şartın atlanmasını, onun çıktıda olmasını istemiyorsak,
        o şartın altına direk continue yazarız ve döngüye devamı sağlarız.
         */
        int n = 20;
        for (int i = 1; i < n; i++) {
            if (i % 7 == 0) {
                continue; // i 7'ye tam bölündüğü sayıları atlar ve döngüye devam eder. çıktı da 7 ve 14 olmaz.

            }
            System.out.print(i + " ");

        }

    }
}
