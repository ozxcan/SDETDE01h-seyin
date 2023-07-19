package j10_String_Manipulation_Version01.Tasks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//       char birinci= harfDepo.charAt(harfDepo.indexOf('H'));//H
//       char ikinci= harfDepo.charAt(harfDepo.indexOf('A'));//A
//       char ucuncu= harfDepo.charAt(harfDepo.indexOf('L'));//L
//       char dorduncu= harfDepo.charAt(harfDepo.indexOf('U'));//U
//       char besinci= harfDepo.charAt(harfDepo.indexOf('K'));//K
//
////        System.out.println(birinci+ikinci+ucuncu+dorduncu+besinci);//373->char ascii değer toplamı
////        System.out.println(""+birinci+ikinci+ucuncu+dorduncu+besinci);//HALUK
////        System.out.println(birinci+ikinci+ucuncu+dorduncu+besinci+""+birinci);//373H

        char a = harfDepo.charAt(harfDepo.indexOf('H'));
        char b = harfDepo.charAt(harfDepo.indexOf('U'));
        char c = harfDepo.charAt(harfDepo.indexOf('S'));
        char d = harfDepo.charAt(harfDepo.indexOf('E'));
        char e = harfDepo.charAt(harfDepo.indexOf('Y'));
        char f = harfDepo.charAt(harfDepo.indexOf('I'));
        char g = harfDepo.charAt(harfDepo.indexOf('N'));
        System.out.println(""+a+b+c+d+e+f+g);















    }
}
