import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size to use quick sort:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int k = 0; k < n; k++) {
            System.out.printf("Enter element %d: \n", k);
            arr[k] = sc.nextInt();
        }
        sort(arr, 0, arr.length - 1);
        System.out.println("The sorted array is:");
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
    }

    public static void sort(int[] a, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(a, lb, ub);
            sort(a, lb, loc - 1);
            sort(a, loc + 1, ub);
        }
    }

    static int partition(int[] a, int lb, int ub) {
        int pivot = a[lb];
        int start = lb + 1;
        int end = ub;
        while (start <= end) {
            while (start <= ub && a[start] <= pivot) {
                start++;
            }
            while (end >= lb + 1 && a[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        int temp = a[lb];
        a[lb] = a[end];
        a[end] = temp;
        return end;
    }
}
