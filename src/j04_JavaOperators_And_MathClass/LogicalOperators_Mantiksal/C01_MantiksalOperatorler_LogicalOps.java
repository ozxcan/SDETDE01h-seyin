package j04_JavaOperators_And_MathClass.LogicalOperators_Mantiksal;

public class C01_MantiksalOperatorler_LogicalOps {

    public static void main(String[] args) {

        // İki boolean değerini kıyaslıyorsak && (and) (ve) or (||) (veya) değerlerini kullanırız.
        //

        int sayi1 = 10;
        int sayi2 = 15;

        int mutlakDeger = Math.abs(sayi1 - sayi2); // Math.abs() iki sayının mutlak değerini alır
        int Buyuk = Math.max(sayi1,sayi2); // İki sayıdan büyük olanı yazar.
        System.out.println(Buyuk);
        System.out.println(mutlakDeger);

        double kuvvet =  Math.pow(sayi1,sayi2); // Math.pow() birinci sayının ikinci sayı ile kuvvetini almaya yarar.
        System.out.println(kuvvet);

        System.out.println(Math.random());  // 0 ve 1(1 Dahil değil) arasında random olarak sayı üretir.
        System.out.println(Math.sqrt (4));  // Sayının karekökünü aldık. Yani 4'ün karekökünü aldık.

        System.out.println(Math.pow (8,(1.0/3))); // Bir sayının küp kökünü aldık bu şekilde. 8 sayı ve yanındaki ifade küp kökü belirtir.
        System.out.println(Math.ceil(7.1));  //Math.ceil() metodu girilen sayıyı yukarı yuvarlar.






    }
}
