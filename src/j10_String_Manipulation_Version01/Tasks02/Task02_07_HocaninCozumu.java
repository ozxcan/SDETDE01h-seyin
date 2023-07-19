package j10_String_Manipulation_Version01.Tasks02;

public class Task02_07_HocaninCozumu {
    public static void main(String[] args) {
        // iki string veriliyor, birinci stringin 3. karekterini alın
        // bu karekter , ikinci stringde varsa oradan silin
        // input :  str1 = selamlar
        //          str2 = merhabalar
        // output   str2=  merhblr
        String str2 = "merhabalar";
        String str1 = "selamlar";

        String ch = ""+str1.charAt(3); // ch='a'
        // veya ch=str1.substring(3,4);

        str2 = str2.replaceAll(ch,"");

        System.out.println(str2);
    }
}
