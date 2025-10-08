package Numbers;

public class SwapNumbers {

    public static void main(String[] args) {
        int a=2, b=3;
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println(a+" " +b);
    }
}
