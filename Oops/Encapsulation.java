package Oops;

public class Encapsulation {

    public static void main(String[] args){
        Student s1= new Student();
        s1.Set("Akshar");
        System.out.println(s1.Get());
    }
}

class Student{
    private String name;

    public void Set(String str){
        this.name=str;
    }
    public String Get(){
        return name;
    }
}
