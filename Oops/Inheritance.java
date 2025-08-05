package Oops;

public class Inheritance  {
    public static void main(String[] args){
        Dog d1= new Dog();
        d1.run();
        d1.sleep();
    }
}

class Animals{
    void sleep(){
        System.out.println("sleeping");
    }
}

class Dog extends Animals{
    void run(){
        System.out.println("running");
    }
}
