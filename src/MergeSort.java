class MergeSort {
    public static void Merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void Sort(int[] arr, int left, int right) {
        if (left < right) {
            int m = left + (right - left) / 2;
            Sort(arr, left, m);
            Sort(arr, m + 1, right);
            Merge(arr, left, m, right);
        }
    }
    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 14, 12, 15, 4, 6, 8 };
        System.out.println("Original array:");
        Print(arr);
        MergeSort ob = new MergeSort();
        ob.Sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        Print(arr);
    }
}