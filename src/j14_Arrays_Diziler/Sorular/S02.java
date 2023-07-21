package j14_Arrays_Diziler.Sorular;

public class S02 {
    public static void main(String[] args) {
        /*
        Dizinin en büyük elemanını bulunuz.
         */
        int[] sayiList={10,3,4,67,5,6};

        int eB = sayiList[0]; // dizinin ilk elemanını en büyük kabul ettim.
        for (int i =1; i<sayiList.length; i++){ // ilk elemanı en büyük kabul ettigim için i = 1 den başlattım.
            if (sayiList[i] > eB) eB = sayiList[i];
        }
        System.out.println("Dizinin en büyük elamanı => " + eB);





    }
}
