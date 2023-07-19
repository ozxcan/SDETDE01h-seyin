package j11_Loops_Donguler.While_Loops.Tasks02;

public class Task02_07 {
    public static void main(String[] args) {

        // rast gele 10 adet sayı üretiniz [1,100], bu sayılardan çift olanların sayısını bulunuz

        int i = 0;
        int ciftAdet = 0;
        while (i < 10) {

            int number = (int) (Math.random() * 100+1);

            if (number % 2 == 0) {
                ciftAdet++;
            }
            i++;
        }
        System.out.println(ciftAdet + " adet çift sayı vardır.");




    }
}
