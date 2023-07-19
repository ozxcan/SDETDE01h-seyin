package j10_String_Manipulation;

import java.util.Scanner;

public class C13_Example_Onemli {
    public static void main(String[] args) {

        /* TASK01

        String name=" Yasin Yalcin";
        String soyisim= "Sari";
        String Kkno=" 1234123412341234";

        oUTPUT --> Y**** Y***** S***
        --> 1234 **** **** ****
                */

        String name =" Yasin Tercan";
        String soyisim= "Sari";
        String no=" 1234123412341234";

        name = name.trim();
        int space = name.indexOf(" ");

        String ilkHarf = name.substring(0,1)+name.substring(1,space).replaceAll("\\S","*").concat(" ");
        String ikinciHarf = name.substring(space+1,space+2).toUpperCase()+name.substring(space+2).replaceAll("\\S","*").concat(" ");
        String soyIsim = soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*");

        System.out.println(ilkHarf+ ikinciHarf+ soyIsim);

        no = no.trim();
        String sayi = no.substring(0,4)+no.substring(4).replaceAll("\\d","*");
        System.out.println(sayi);










    }
}
