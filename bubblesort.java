import java.util.*;
public class bubblesort 
{
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void gettingArray(){
        System.out.println("Enter an size of array");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int [] array = new int[size];
        System.out.println("Enter elements in the array");
        for (int i = 0; i <array.length; i++) {
           array[i] = scn.nextInt();
        }
        System.out.println("Priting the array you have input");
        printArray(array);
        System.out.println("\nDoing Bubble sort of the array");
        bubbleSort(array);

    } 
    public static void bubbleSort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    // calling the swapping function
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Priting the array");
        printArray(arr);
    }
    public static void main(String[] args){
        
        
        gettingArray();

    }    
}
