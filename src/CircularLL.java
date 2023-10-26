

public class CircularLL {
    private CircularLL head;
    private CircularLL tail;
    private CircularLL(){
        this.head=null;
        this.tail=null;
    }
    public void insert(int val){
        Node node= new Node(val);
        if(head==null){
          //  head=node;
            //tail=node;
        }
    }
    private int size;
    private class Node{
        private int value;
        private CircularLL.Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, CircularLL.Node next){
            this.value= value;
            this.next=next;
        }

    }

    public static void main(String[] args) {

    }
}
