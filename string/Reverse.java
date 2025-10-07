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

        System.out.println(reverse(n));
        System.out.println(reve(n));
    }

    public static String reverse(String str){
        StringBuilder rev = new StringBuilder(str);
        return  rev.reverse().toString();

    }

    public static String reve(String str){
        String r="";
        for(int i=str.length()-1; i>=0;i--){
            r=r+str.charAt(i);
        }
        return r;
    }
}
