package j10_String_Manipulation_Version01.Tasks02;

public class Task02_01_HocaninCozumu {
    public static void main(String[] args) {
        // verilen stringin 3. index i  varsa silin
        String str = "halime";
        if (str.length()>3) {
            String tempStr = str.substring(0,3);
            if (str.length() != 4) str = tempStr+str.substring(4);
            else str = tempStr;
            // alttaki tek satır üste ki 3 satır yerine olur
            str = str.substring(0,3)+str.substring(4);

            System.out.println(str);
        } else {
            System.out.println("3. index yoktur");
        }
    }
}
