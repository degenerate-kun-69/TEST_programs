import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size to use selection sort:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int k = 0; k < n; k++) {
            System.out.printf("Enter element %d: \n", k);
            arr[k] = sc.nextInt();
        }
        int[] sortedArray= sort(arr);
        System.out.println("The sorted array is:");
        for (int i : sortedArray) {
            System.out.printf("%d ", i);
        }
    }
    static int[] sort(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp= arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}