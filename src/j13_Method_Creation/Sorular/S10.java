package j13_Method_Creation.Sorular;

public class S10 {
    public static void main(String[] args) {
        /*
        4. Write a Java method to count all vowels in a string.
                Test Data:
                Input the string: w3resource
                Expected Output:

                Number of  Vowels in the string: 4
         */
        String str = "Hüseyin";
        int count = counter(str);
        System.out.println(count);



    }
    public static int counter (String str) {
        int counter = 0;
        String sample = "aeıioöuü";
        for (int i =0; i < str.length(); i++) {
            if (sample.contains(str.substring(i,i+1))) {
                counter++;

            }

        }
        return counter;
    }
}
