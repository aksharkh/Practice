package arrays;

public class LargestAndSmallest {
    public static void main(String[] args){
        int[] arr={9,2,3,4,5,6,7};
        int min=arr[0],max=arr[0];

        for(int num:arr){
            if(max<num) max=num;
            if(min>num) min=num;


        }
        System.out.println(max);
        System.out.println(min);
    }
}
