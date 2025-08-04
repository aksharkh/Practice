package pp;

public class binary {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int tar=1;
        System.out.println(Algo(arr,tar));
    }



    public static int Algo(int[] arr, int target){
        int e=arr.length-1,s=0;
        while(s<=e){
            int mid= s+(e-s) /2;
            if(arr[mid]== target) return mid;
            if(arr[mid]>target) e= mid-1;
            else s=mid+1;
        }
        return -1;
    }
}
