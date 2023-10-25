public class LinkedList {
    private Node head;

    private Node tail;
    private int size;
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value= value;
            this.next=next;
        }

    }
    public LinkedList(){
        this.size=0;
    }
    public void insertAtBeg(int val){
        Node  node = new Node(val);
        node.next=head;
        head= node;
        if (tail==null){
            tail=head;
        }
        size++;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void insertAtEnd(int val){
        Node node = new Node(val);
        tail.next= node;
        tail=node;
        size++;
        if(tail==null){
            insertAtBeg(val);
        }
    }
    public void insertAtPos(int val,int index){
        if(index==0){
            insertAtBeg(val);
        }
        else if(index==size){
            insertAtEnd(val);
        }
        else{
            Node temp= head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            Node node = new Node(val,temp.next);
            temp.next=node;
            size++;
        }
    }
    public void delAtBeg(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        System.out.println("Removed value: "+val);
    }
    public void delAtEnd(){
        if(size<=1){
            delAtBeg();
        }
        Node secondlast=get(size-2);
        int val = tail.value;
        tail=secondlast;
        tail.next=null;
    }
    public int delAtPos(int pos){
        if(pos==0){
            delAtBeg();
        }
        else if(pos==size-1){
            delAtEnd();
        }
        Node prev = get(pos-1);
        int val=prev.next.value;
        return val;
    }
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp= temp.next;
        }
        System.out.print("End");
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertAtBeg(1);
        list1.insertAtBeg(2);
        list1.insertAtBeg(3);
        list1.insertAtBeg(4);
        list1.insertAtBeg(5);
        list1.insertAtEnd(0);
        list1.insertAtPos(17,3);
        list1.display();
        list1.delAtBeg();
        list1.display();
        list1.delAtEnd();
        list1.display();

    }
}