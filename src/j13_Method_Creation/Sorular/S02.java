package j13_Method_Creation.Sorular;

public class S02 {
    public static void main(String[] args) {
// task-> girilen 3 sayının ortalamasını print eden ortalamaBul adında bir METHOD create ediniz
        int n1 = 22;
        int n2 = 17;
        int n3 = 45;
//        double avg =ortalamaBul(n1,n2,n3);
//        System.out.println("Ortalama = "+avg);
        // ustteki 2 satır yerine
        System.out.println("Ortalama = "+ortalamaBul(n1,n2,n3));

    }

    private static double ortalamaBul(int n1, int n2, int n3) {
        double sonuc = (n1+n2+n3) / 3.0;
        return sonuc;
    }
}
