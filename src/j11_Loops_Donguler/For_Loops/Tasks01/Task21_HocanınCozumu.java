package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task21_HocanınCozumu {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.print("satir gir : ");
//        int n = input.nextInt();
        int n=10;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                if (j==1 || j==i || i==n) System.out.print("* ");
                else System.out.print("! ");
            }
            System.out.println();
        }


    }

}
































