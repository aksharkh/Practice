package Oops;

public class ClassAndObject {
        public static void main(String[] args){
            Animal dog= new Animal();
            dog.name="bruno";
            dog.age=12;
            dog.sleep();
        }
}

class Animal{
    String name;
    int age;

    public void sleep(){
        System.out.println(name+" sleeping");
        System.out.println("age is "+age);
    }
}
