package string;

public class CountChar {

    public static int count(String str, char c){
        int n=0;
        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i) == c) n++;
        }
        return n;


    }

    public static void main(String[] args) {
        char c='g';
        String str="ggakshrg";
        System.out.println(count(str,c));
    }
}
