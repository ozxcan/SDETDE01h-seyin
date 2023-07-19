package j10_String_Manipulation;

public class C02_With_IndexOf {
    public static void main(String[] args) {
        // .indexOf() metodu, girmiş olduğunumuz karakterin string içinde kaçıncı INDESKTE olduğunu verir bize.
        // Sonucu INTEGER olarak verir.

        String str = "Murat";

        int yer = str.indexOf ("r"); // String içinde bulunan r karakterinin index değirir verir.
        System.out.println(yer+ "indeksinde bulunur.");

        //Örnek String içindeki boşluk kaçıncı karakterdedir?
        String str2 ="Faruk Kadı";
        int yer2 = str2.indexOf(" "+"indeksinde bulunur.");
        System.out.println(yer2);

        // Örnek Stirng içinde boşluktan sonra kaç karakter vardır?
        String str3 ="Faruk Kadı";

        int num = (str3.length() -1) - str3.indexOf(" ");
        System.out.println(num);

        // Verilen stringin ortadaki karakterini print ediniz?
        String str4 = "Faruk Kadılara"; // Bunun ortanca karakteri
        System.out.println(str4.charAt(str4.length()/2));













    }
}
