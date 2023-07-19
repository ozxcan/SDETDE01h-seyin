package j11_Loops_Donguler.For_Loops.Tasks02;

public class Task02_07 {
    public static void main(String[] args) {
        // 1 ila 100 arasında rastgele üretilen 10000 adet int sayıdan
        // % kaçı tek sayıdır

        int tekSayiAdet =0;

        for (int i = 0; i < 10000; i++) {

            int sayi = (int)(Math.random()*100+1);
            if (sayi % 2 != 0) {
                tekSayiAdet++;


            }

        }double oran = (double) (tekSayiAdet * 100) /10000;
        System.out.println("Tek sayıların oranı ==>" + oran);
    }
}
