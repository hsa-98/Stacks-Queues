public class   Node<E> {
    private E node; //Stores the value given by the user
    private Node<E> next; //stores the address for the next node

    public E getNode() {
        return node;
    }

    public void setNode(E node) {
        this.node = node;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}



