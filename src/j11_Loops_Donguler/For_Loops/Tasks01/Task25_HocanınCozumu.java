package j11_Loops_Donguler.For_Loops.Tasks01;

import java.util.Scanner;

public class Task25_HocanınCozumu {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden  create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = input.nextLine();//"aabbcccccddddaaa"
        String output = "";//işleme etki etmeyecek boş kutu tanımlandı

        for (int i = 0; i <str.length() ; i++) {
            String ch = str.substring(i,i+1);
            if (!output.contains(ch)) {
                output=output+ch;
            }
        }
        System.out.println(output);
    }
}
