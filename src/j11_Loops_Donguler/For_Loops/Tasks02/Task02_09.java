package j11_Loops_Donguler.For_Loops.Tasks02;

public class Task02_09 {
    public static void main(String[] args) {
        // Bir string veriliyor, for kullanarak her harf arasına bir boşluk gelecek  şekilde yazdırın
        // ama yazarken ilk harf büyük olsun ve sonrası bir küçük, bir büyük harf olarak devam etsin
        String str = "Selamlar";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.toUpperCase().charAt(i) + " ");
            } else {
                System.out.print(str.toLowerCase().charAt(i) + " ");
            }

        }
        System.out.println();


        // İKİNCİ ÇÖZÜM

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.substring(i,i+1).toUpperCase()+ " ");
            }else {
                System.out.print(str.substring(i,i+1).toLowerCase()+ " ");
            }


        }
        System.out.println();


        // ÜÇÜNCÜ ÇÖZÜM


        boolean buyukSirasi = true;
        for (int i = 0; i < str.length(); i++) {
            if (buyukSirasi) {
                System.out.print(str.substring(i,i+1).toUpperCase()+ " ");
                buyukSirasi = false;
            }else {
                System.out.print(str.substring(i,i+1).toLowerCase()+ " ");
                buyukSirasi = true;
            }


        }


    }
}
