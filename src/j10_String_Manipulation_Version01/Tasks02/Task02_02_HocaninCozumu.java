package j10_String_Manipulation_Version01.Tasks02;

public class Task02_02_HocaninCozumu {
    public static void main(String[] args) {
        // Verilen stringin , ilk karekterini silin
        String str = "Hüseyin";
        str = str.substring(1);
        System.out.println(str);
    }
}
