package j04_JavaOperators_And_MathClass.LogicalOperators_Mantiksal;

public class Tasks {
    public static void main(String[] args) {
        int x= 15, y=10,z=15;
        System.out.println((x==5) && (z==15));
        System.out.println((x==5) || (z==15));
        System.out.println((x==5) && !(y==15));
        System.out.println(!(x==5) || (y==15));
        System.out.println(!true);
        System.out.println(((x==5) && (z==10)) && ((x==5) || (y==15)) );
        System.out.println(((x==5) && (z==10)) || ((x==5) || (y==15)) );
        System.out.println(((x==5) && (z==10)) || ((x==15) || (y==15)) );
    }
}
