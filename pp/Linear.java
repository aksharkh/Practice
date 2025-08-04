package pp;

public class Linear {
    public static void main(String[] args) {
        int[] arr={3,1,2,9,6,8,4};
        int target= 9;
        System.out.println(Algo(arr,target));

    }
    public static int Algo(int[] arr, int target){
        for(int i=0;i<= arr.length-1;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
}