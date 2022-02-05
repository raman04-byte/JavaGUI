import java.util.*;
public class selection_sort {
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }}
        
    public static void main(String[] args){
        int arr[] = {2,5,3,7,4};

        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j =i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }

            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
     printArray(arr);   
    }
}
