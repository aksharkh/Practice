package Numbers;

public class SumNumber {

    public static int sum(int n){
        int s=0;
        while(n!=0){
            s+= n%10;
            n/=10;
        }
        return s;
    }

    public static void main(String[] args) {
        int n=1234;
        System.out.println(sum(n));
    }
}
