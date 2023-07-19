package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task40_HocanınCozumu {
    public static void main(String[] args) {
        // * polindrome sorusunu (Task02) stringi ters çevirmeden ,
        // farklı bir string kullanmadan çözünüz
        String str = "A dıd A f f f f f f f  af a fads A";
        // 0 il1 6 karşılaştır
        // 1 ile 5 i
        // 2 ile 4
        boolean polidrome=true;
        for (int i = 0; i <str.length()/2 ; i++) {
            String ilk = str.substring(i,i+1);
            String son = str.substring(str.length()-1-i,str.length()-i);
            if ( !ilk.equalsIgnoreCase(son)) {
                polidrome=false;
                break;
            }
            System.out.print(i+ " ");
        }
        System.out.println();
        if (polidrome) System.out.println(str+" polidrom dur");
        else System.out.println(str+" polidrom değildir");
    }
}
