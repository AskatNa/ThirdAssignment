import java.util.Scanner;

public class QuickSort {
    public static int Partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low - 1);
        for(int j = low ; j < high; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public void Sort(int[] arr, int low, int high){
        if(low < high){
            int pi = Partition(arr,low,high);
            Sort(arr,low, pi - 1);
            Sort(arr,pi + 1, high);
        }
    }
    public static void Print(int[] arr){
        for(int i = 0; i < arr.length;i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,5,82,4};
        int a = arr.length;
        QuickSort ob = new QuickSort();
        ob.Sort(arr,0,a - 1);
        System.out.println("Sorted array");
        Print(arr);
    }
}
