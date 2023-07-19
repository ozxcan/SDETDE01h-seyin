package j02_Data_Types_and_WrapperClass.Tasks;

public class Task02_SWAP_Variable_DegerDegistirme {
     /*
        TASK :
        Verilen int sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20

         */

    public static void main(String[] args) {
        // Bir variable kullanarak değer değiştirme.

        int sayi1= 20;
        int sayi2= 34;
        int temp = sayi2;


        sayi2 = sayi1;
        sayi1 = temp;
        System.out.println("Sonuc: " + sayi1 + " " +sayi2);
        System.out.println("Sayi1: " + sayi1);
        System.out.println("Sayi2: " + sayi2);
        System.out.println();

        // Bir Variable kullanmadan değer değiştirme.

        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;


        System.out.println("Son durum sayı1: " + sayi1 + "\nSon durum sayı2: " + sayi2);


    }
}
