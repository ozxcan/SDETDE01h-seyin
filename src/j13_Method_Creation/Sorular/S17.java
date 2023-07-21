package j13_Method_Creation.Sorular;

public class S17 {
    public static void main(String[] args) {
        /*
        Verilen string'in sonu "et" ile bitiyorsa, true değilse false yazan bir method yazınız
         */
        String str = "selamet";
        String suffix = "et";
        boolean result = sonKontrol(str,suffix);
        System.out.println(result);

    }

    private static boolean sonKontrol(String str, String suffix) {
        return str.endsWith(suffix); // "et" ile biterse true, bitmez ise false geri dönderir.
    }
}
