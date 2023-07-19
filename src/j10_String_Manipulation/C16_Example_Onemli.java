package j10_String_Manipulation;

public class C16_Example_Onemli {
    public static void main(String[] args) {

        /* TASK 04
        String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        String  str 1= "$13.99"
        String str 2= "$10.55"
        ipucu: Double parseDouble() methodunu kullanabilirsiniz.

        --> Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
         */


        String  str1 = "$13.99";
        String str2 = "$10.55";
        str1 = str1.substring(1);
        str2 = str2.substring(1);
        double m = Double.parseDouble(str1);
        double n = Double.parseDouble(str2);
        System.out.println("Toplam = $" + (m+n));




    }
}
