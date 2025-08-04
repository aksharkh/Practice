package pp;

public class selection {
    public static void main(String[] args){
        int[] arr = {3,1,2,9,6,8,4};
        Algo(arr);
        for(int num : arr) System.out.print(num+" ");
    }
    public static void Algo(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]) min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
