public class LinearSearch {
    public static void main(String[] args) {
        int[]arr= {10,20,30,40,1423,200,21300,20000};
        for(int i:arr){
            if(arr[i]==20000){
                System.out.println("pos of element: "+i);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
