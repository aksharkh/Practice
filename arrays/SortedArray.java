package arrays;

public class SortedArray {
    public static void main(String[] args){
        int[] arr={9,2,3,4,5,6,7};
        System.out.println(Algo(arr));
        System.out.println(Algo1(arr));
    }
    public static boolean Algo(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]> arr[i+1]) return false;
        }
        return  true;
    }

    public static boolean Algo1(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
