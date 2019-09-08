public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void push(int element) {
        Node newNode = new Node(element);
        newNode.setNext(head);
        head = newNode;
    }
    public void pop(){
        head = head.next;
    }

    public void print(){
        while (!head.isEmpty()){
            System.out.println(this.head.item);
            this.head = this.head.next;
        }
    }
}
