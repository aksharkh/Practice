package arrays;

public class SortedArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]> arr[i+1]) return false;
        }
        return  true;
    }
}
