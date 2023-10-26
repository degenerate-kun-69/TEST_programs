import ds.ll.LinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    public void insertfirst(int val){
        Node node= new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){head.prev=node;}
        head=node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }
    public Node find(int value){
        Node node= head;
        while(node!=null){
            if(node.val == value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insertAtPos(int after,int val){
        Node p= find(after);
        if(p==null){
            System.out.println("Does not exist");
            return;
        }
        Node node= new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){node.next.prev=node;}


    }
    public void display(){
        Node node= head;
        while(node!=null){
            System.out.print(node.val+"->");
            node= node.next;
        }
        System.out.println("end");
    }
    public void displayrev(){
        Node node=head;
        Node last=node;
        while(node!=null){
            last=node;
            node=node.next;
        }

        while(last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("end");
    }
    public static void main(String[] args) {
        DoublyLinkedList list1 = new DoublyLinkedList();
        list1.insertfirst(1);
        list1.insertfirst(2);
        list1.insertfirst(3);
        list1.insertfirst(4);
        list1.insertfirst(5);
        list1.display();
        list1.insertAtPos(5,3);
        // list1.delAtBeg();
        list1.display();
        list1.insertLast(15);
        // list1.delAtEnd();
        list1.display();
        list1.displayrev();

    }
    private static class Node{
        Node next;
        Node prev;
        int val;
        public Node(int val){this.val=val;}
        public Node(int val, Node next,Node prev){
            this.val=val;
            this.prev=prev;
            this.next=next;
        }
    }
}
