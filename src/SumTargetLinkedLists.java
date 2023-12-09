import ds.ll.LinkedList;
import java.util.Scanner;
//This program traverses 2 linked lists, to search for a pair of elements
//that give the sum as the given number, can also be changed to any other binary operation.
public class SumTargetLinkedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list2 = new LinkedList();
        for (int i = 5; i >-1; i--) {
            list2.insertAtBeg(i);
        }
        LinkedList list3 = new LinkedList();
        list3.insertAtBeg(12);
        list3.insertAtBeg(10);
        list3.insertAtBeg(5);
        list3.insertAtBeg(4);
        list3.insertAtBeg(2);
        System.out.println("Enter Target Number");
        int target = sc.nextInt();

        // Get the head nodes of both lists
        LinkedList.Node currentList2 = list2.getHead();
        LinkedList.Node currentList3 = list3.getHead();

        // Traverse both lists and find pairs with the given sum
        while (currentList2 != null) {
            while (currentList3 != null) {
                if (currentList2.value + currentList3.value == target) {
                    System.out.println(currentList2.value + " " + currentList3.value);
                }
                currentList3 = currentList3.next;
            }
            currentList3 = list3.getHead();
            currentList2 = currentList2.next;
        }
    }
}
