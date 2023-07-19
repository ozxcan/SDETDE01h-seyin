package j04_JavaOperators_And_MathClass.Assignment_Atama_Operators;

public class C01_Assigment_AtamaOp {
    public static void main(String[] args) {
        // bir karakteri bir değişkene tanımlayıp, o değişkeni math işlemleri ile atırıp azaltma çarpma bölme
        // yapıyoruz.

        int a;
        a = 10;
        a++;
        a +=2;// a = a+2 a? 13

        a *= 3; // a = a*3 a= 39
        a -=10; // a = a-10 a= 29
        a /=3; // a = a/3 a =9 Integer olduğu için
        System.out.println(a);

        int b;
        b = 20;
        b++;
        b +=5;
        b -=3;
        b *=2;
        b /=4;
        System.out.println(b);

        int yas = 33;
        System.out.println(yas+5);
        System.out.println("yas = " + yas);

        System.out.println(yas +=11);
        System.out.println("yas = " + yas);













    }




}
