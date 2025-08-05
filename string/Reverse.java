package string;

public class Reverse {
    public static void main(String[] args){
        String n="akshar k h";


        String r="";

        for(int i=n.length()-1;i>=0;i--){
            r=r+n.charAt(i);
        }
        System.out.println(r);


        StringBuilder str = new StringBuilder(n);
        System.out.println(str.reverse().toString());
    }
}
