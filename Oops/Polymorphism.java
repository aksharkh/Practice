package Oops;

public class Polymorphism {
    public static void main(String[] args) {
        Cal c1= new Cal();
        System.out.println(c1.add(4,5));
        System.out.println(c1.add(4.5,5.6));

        Cal c2= new Cal1();
        System.out.println(c2.add(4,5));
    }

}

class Cal{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}

class Cal1 extends Cal{
    @Override
    int add(int a, int b){
        return a*b;
    }
}
