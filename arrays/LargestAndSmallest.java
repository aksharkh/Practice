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
        System.out.println(largest(arr));
        System.out.println(small(arr));
    }

    public static int largest(int[] arr){
        int larg=arr[0];
        for(int n:arr){
            if(n>larg) larg=n;
        }
        return larg;
    }


    public static int small(int[] arr){
        int small=arr[0];

        for(int n: arr){
            if(n<small) small=n;
        }

        return small;
    }
}
