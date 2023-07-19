package j06_If_ElseIf_Else_Konular;

public class C06_Char_Methot_Kullanımı {
    public static void main(String[] args) {


        char ch = 'A';
        /* Character Metotları */
        if (Character.isAlphabetic(ch)); // Ch karakteri alfabetik mi değil mi diye boolean olarak sorar.
        if (!Character.isAlphabetic(ch)); // Ch karakteri alfabetik değil mi diye boolean olarak sorar.
        if (Character.isDigit(ch)); // Ch karakteri rakamsal değer mi diye boolean olarak sorar.
        if (Character.isUpperCase(ch)); // Ch karakteri büyük harftir mi diye boolean olarak sorar.
        if (Character.isLowerCase(ch)); // Ch karakteri kücük harftir mi diye boolean olarak sorar.
        if (Character.isLetter(ch)); // ch değeri harf mi değil mi  diye boolean olarak sorar.

    }
}
