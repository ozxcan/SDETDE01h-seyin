package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task29 {

    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Haluk  output: HaLuK


        String input= "Java candir, Selenium heyecandir";

        for(int i=0; i<input.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(input.toUpperCase().charAt(i)+" ");
            }else {
                System.out.print(input.toLowerCase().charAt(i)+" ");
            }
        }






    }
}
