public class Node<Item> {
    Item item;
    Node next;

    public Node(Item element) {
        this.item = element;
        this.next = null;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    public boolean isEmpty() {
        return this.next == null;
    }
}