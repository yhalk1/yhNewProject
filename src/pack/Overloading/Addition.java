package pack.Overloading;

public class Addition {


    public int add (int a, int b){
        return a+b;
    }

    public int add (int a, int b, int c){
        return a+b+c;
    }

    public double add (double a, double b){
        return a+b;
    }

    public static void main (String[] args){

        Addition a1 = new Addition();

        System.out.println("The sum is " + a1.add(12,12) );
        System.out.println("The sum is " + a1.add(12,12, 34) );
        System.out.println("The sum is " + a1.add(12.567,12.3456) );

    }
}
