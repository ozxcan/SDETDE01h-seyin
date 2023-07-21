package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task26 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile
    public static void main(String[] args) {
        // task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
        // input-> javacanlara selam olsun
        // output-> javcnlr semou

        String str = "javacanlara selam olsun";
        String yeniString = newString(str);
        System.out.println(yeniString);





    }//main sonu
    public static String newString (String str) {
        String yeniStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (!yeniStr.contains(str.substring(i,i+1))) {
                yeniStr = yeniStr + str.substring(i,i+1);
            }
        }
        return yeniStr;
    }



}
