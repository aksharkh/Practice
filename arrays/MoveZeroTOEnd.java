package arrays;

public class MoveZeroTOEnd {
    public static void main(String[] args){
        int[] arr={0,1,0,2,0,3,0,4};
        Algo(arr);
        for(int n: arr) System.out.print(n+ " ");
    }
    public static void Algo(int[] arr){
        int index=0;
        for(int num: arr){
            if(num != 0) {
                arr[index] = num;
                index++;
            }

        }
        while (index< arr.length) {
            arr[index]=0;
            index++;
        }
    }
}
