package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task34 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6


        for (int i = 0; i <7; i++) {
            for (int j=0 ; j < 7-i; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }



    }
}


