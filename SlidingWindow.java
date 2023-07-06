import java.util.Arrays;

class SlidingWindowJava {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 3;
        SlidingWindow(arr,k);
    }

public static void SlidingWindow(int[] arr, int k){
    for(int i = 0; i<arr.length - k; i++){
       int max = arr[i];
       for(int j = 1; j<k;j++){
           if(arr[i+j]>max){
               max = arr[i+j];
           }
       }
       System.out.println(max+ "");
    }
}
}
