import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size to use bubble sort:");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int k = 0; k < n; k++) {
            System.out.printf("Enter element %d: \n", k);
            a[k] = sc.nextInt();
        }

        for (int i = 0; i < a.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }

        System.out.println("The sorted array is:");
        for (int i : a) {
            System.out.printf("%d ", i);
        }
    }
}
