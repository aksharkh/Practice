package arrays;

public class MissingNumber {
    public static void main(String[] args){
        int[] arr={1,2,4,5,6};
        System.out.println(Algo(arr,6));
    }
    public static int Algo(int[] arr, int n){
        int sum=(n*(n+1))/2;
        for(int num: arr) sum -=num;

        return sum;
    }
}
