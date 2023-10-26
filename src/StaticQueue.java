import java.io.*;
import java.util.*;
public class StaticQueue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of queue");
        int[]arr= new int[sc.nextInt()];
        int i = 0;
        while(i!=1){
            System.out.println("Press 1 to exit");
            System.out.println("Press 2 to insert element in queue");
            System.out.println("Press 3 to pop element from queue");
            i=sc.nextInt();
            if(i==2){
                insert();
            }
            else if(i==3){
                delete();
            }
            else{
                System.out.println("Invalid input");
            }
        }
    }
    public static void delete(){
        //if(rear==-1&&front==-1){
            System.out.println("Underflow");
      //  }
    }
    public static void insert(){}
}
