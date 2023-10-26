import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element you would like to find:");
        int elem = sc.nextInt();
        int ans = binsearch(elem, arr);
        System.out.println("Element found at index: " + ans+" (0 based indexing)");
    }
    static int binsearch(int element, int[] array) {
        int start = 0;
        int end = array.length - 1;
        Arrays.sort(array);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (element < array[mid]) {
                end = mid - 1;
            } else if (element > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}