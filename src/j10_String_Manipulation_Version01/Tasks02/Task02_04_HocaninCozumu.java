package j10_String_Manipulation_Version01.Tasks02;

public class Task02_04_HocaninCozumu {
    public static void main(String[] args) {
        // "ad soyad" şeklinde string veriliyor,  soy ad içierisinde ki ilk
       // "e" harfinin indexini bulun
        String str = "Selim Caner";
        int indexBosluk = str.indexOf(" ");
        int indexE = str.indexOf('e',indexBosluk);
        // veya
        int indexE2 = str.indexOf('e',str.indexOf(' '));
        System.out.println(indexE);

    }
}
