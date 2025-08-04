package arrays;

public class SecondLargest {
    public static void main(String[] args){
        int[] arr={9,1,3,4,5,6,7};
        int largest=arr[0],second=arr[0];

        for(int num: arr){
            if(num>largest){
                second=largest;
                largest=num;
            } else if(num>second && num!=largest) {
                second=num;
            }
        }
        System.out.println(second);
    }
}
