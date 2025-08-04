package pp;

public class Insertion {
    public static void main(String[] args){
            int[] arr={2,1,5,3,7,4,9,8};
            Algo(arr);
            for(int num: arr) System.out.print(num+ " ");

    }

    // insertion sort
    public static void Algo(int[] arr){
        for(int i=1; i< arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}


