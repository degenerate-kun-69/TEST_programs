import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size to use selection sort:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int k = 0; k < n; k++) {
            System.out.printf("Enter element %d: \n", k);
            arr[k] = sc.nextInt();
        }
        int[] sortedArray = sort(arr);
        System.out.println("The sorted array is:");
        for (int i : sortedArray) {
            System.out.printf("%d ", i);
        }
    }
    static int[] sort(int[] arr){
        for(int i=0; i<arr.length;++i){
            int key=arr[i];
            int j= i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}