package j11_Loops_Donguler.While_Loops.Konu_ve_Sorular;

public class C01_WhileLoop_KonuAnlatimi {
    public static void main(String[] args) {
        // While döngüsünde başlangıç değerini mutlaka bizim vermemiz lazım. Yani i 'yi başlangıçta tanımlamamız lazım.
        // While bitiş ya da kontrol şartını while () parantezi içine yazmamız lazım.

        /*
        Başlangıç bitiş ve değişim değerleri net  bilinen
        tekrarlarda for loop ama adım sayısı değişim değeri
        net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlara while loop kullanılır.
         */

        /*
        Task ---->
        3' dahil 20 'ye kadar (20 dahil) olan tam sayıları ve toplamını print eden code yazınız.
         */

        int n = 20;
        int i = 3;
        int toplam = 0;
        while (i <= n) {
            System.out.print(i + " ");
            toplam += i;
            i++;
        }
        System.out.println();
        System.out.println("Genel Toplam==> " +toplam);


















    }


}
