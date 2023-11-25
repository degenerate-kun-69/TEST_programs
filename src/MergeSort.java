import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size to use merge sort:");
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
            int mid = (lb + ub) / 2;
            sort(a, lb, mid);
            sort(a, mid + 1, ub);
            merge(a, lb, mid, ub);
        }
    }

    public static void merge(int[] a, int lb, int mid, int ub) {
        int[] b = new int[a.length];
        int i = lb;
        int j = mid + 1;
        int k = lb;
        while (i <= mid && j <= ub) {
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            b[k] = a[i];
            i++;
            k++;
        }
        while (j <= ub) {
            b[k] = a[j];
            j++;
            k++;
        }
        for (i = lb; i <= ub; i++) {
            a[i] = b[i];
        }

    }
}
