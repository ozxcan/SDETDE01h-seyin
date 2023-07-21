package j14_Arrays_Diziler.Sorular;

public class S04_1 {
    public static void main(String[] args) {

        int [] list = new int[10];

        for (int i = 0; i<list.length; i++) {
            list[i] = (int) (Math.random()*100+1);

            System.out.print(list[i]+ " ");

        }
        System.out.println();
        int enKucukIndex = 0;
        int enBuyukIndex = 0;


        for (int i = 1; i < list.length; i++) {
            if(list[i] < list[enKucukIndex]) {
                enKucukIndex = i;
            }
            if (list[i] > list[enBuyukIndex]) {
                enBuyukIndex = i;
            }

        }
        int enKucukEleman = list[enKucukIndex];
        int enBuyukEleman = list [enBuyukIndex];

        if (enBuyukIndex>enKucukIndex) {
            if (enBuyukIndex == enKucukIndex+1) System.out.println("Aralarında eleman yoktur.");
            else {
                for (int i = enKucukIndex+1; i<enBuyukIndex; i++) {
                    System.out.print(list[i]+ " " );
                }
            }

        }else {
            if (enBuyukIndex+1 == enKucukIndex) System.out.println("Aralarında eleman yoktur.");
            else {
                for (int i = enBuyukIndex+1; i<enKucukIndex; i++) {
                    System.out.print(list[i]+ " " );
                }
            }

        }

        System.out.println();
        System.out.println("En küçük eleman ==> " + enKucukEleman);
        System.out.println("En büyük eleman ==> " + enBuyukEleman);









    }
}
