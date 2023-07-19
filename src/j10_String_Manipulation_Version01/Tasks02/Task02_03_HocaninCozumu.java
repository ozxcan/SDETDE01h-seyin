package j10_String_Manipulation_Version01.Tasks02;

public class Task02_03_HocaninCozumu {
    public static void main(String[] args) {
        // Verilen stringin , son karekterini '*' ile değiştirin
        String str="özcan"; // özca*
        if (str.length()>0) {
            str = str.substring(0,str.length()-1)+"*";
        } else {
            System.out.println("son karekter yok ki neyi değiştireyim");
        }

        System.out.println(str);
    }
}
