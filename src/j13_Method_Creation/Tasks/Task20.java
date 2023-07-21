package j13_Method_Creation.Tasks;

import java.util.Arrays;

public class Task20 {
    /*
    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden
      2 METHOD create ediniz

       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */

    public static void main(String[] args) {
        String para = "$1 $12 €34 €56 $45 €78";


       toplam(para);

    }
    public static void toplam(String str) {
        int birinciB = str.indexOf(" ");
        int ikinciB = str.indexOf(" ",birinciB+1);
        int ucuncuB = str.indexOf(" ",ikinciB+1);
        int dorduncuB = str.indexOf(" ",ucuncuB+1);
        int besinciB = str.indexOf(" ",dorduncuB+1);
        int dT = 0;
        int eT = 0;

        if (str.charAt(0) == '$') dT = dT + Integer.parseInt(str.substring(1,2));


        if (str.charAt(birinciB+1) == '$') dT = dT + Integer.parseInt(str.substring(birinciB+2,birinciB+3))*10 + Integer.parseInt(str.substring(birinciB+3,birinciB+4));
        else eT = eT + Integer.parseInt(str.substring(birinciB+2,birinciB+3))*10 + Integer.parseInt(str.substring(birinciB+3,birinciB+4));

        if (str.charAt(ikinciB+1) == '$') dT = dT + Integer.parseInt(str.substring(ikinciB+2,ikinciB+3))*10 + Integer.parseInt(str.substring(ikinciB+3,ikinciB+4));
        else eT = eT + Integer.parseInt(str.substring(ikinciB+2,ikinciB+3))*10 + Integer.parseInt(str.substring(ikinciB+3,ikinciB+4));

        if (str.charAt(ucuncuB+1) == '$') dT = dT + Integer.parseInt(str.substring(ucuncuB+2,ucuncuB+3))*10 + Integer.parseInt(str.substring(ucuncuB+3,ucuncuB+4));
        else eT = eT + Integer.parseInt(str.substring(ucuncuB+2,ucuncuB+3))*10 + Integer.parseInt(str.substring(ucuncuB+3,ucuncuB+4));

        if (str.charAt(dorduncuB+1) == '$') dT = dT + Integer.parseInt(str.substring(dorduncuB+2,dorduncuB+3))*10 + Integer.parseInt(str.substring(dorduncuB+3,dorduncuB+4));
        else eT = eT + Integer.parseInt(str.substring(dorduncuB+2,dorduncuB+3))*10 + Integer.parseInt(str.substring(dorduncuB+3,dorduncuB+4));

        if (str.charAt(besinciB+1) == '$') dT = dT + Integer.parseInt(str.substring(besinciB+2,besinciB+3))*10 + Integer.parseInt(str.substring(besinciB+3,besinciB+4));
        else eT = eT + Integer.parseInt(str.substring(besinciB+2,besinciB+3))*10 + Integer.parseInt(str.substring(besinciB+3,besinciB+4));

        System.out.println("$ toplamı ==> " + dT);
        System.out.println("€ toplamı ==> " + eT);


    }



}
