public class SelectionSort {
    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int[] arr = { 14, 12, 15, 4, 6, 8  };
        System.out.println("Original array:");
        Print(arr);
        ob.Sort(arr);
        System.out.println("Sorted array:");
        Print(arr);
    }
}
