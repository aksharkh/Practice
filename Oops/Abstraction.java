package Oops;

public class Abstraction {
    public static void main(String[] args) {
        Cat n= new Cat();
        Cow m= new Cow();
        n.sleep();
        n.sound();
        m.eat();
    }
}

abstract class Mamal{
    abstract void sleep();

    void sound(){
        System.out.println("barking");
    }
}

class Cat extends Mamal{
    void sleep(){
        System.out.println("sleeping");
    }
}

interface Mamal1{
    void eat();
}

class Cow implements Mamal1{
    public void eat(){
        System.out.println("eating");
    }
}
