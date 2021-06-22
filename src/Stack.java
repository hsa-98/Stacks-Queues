import java.util.Scanner;

public class Stack {
    Node head = new Node();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

        int choice = 0;
        while (choice != 4) {

            System.out.println("1)Add number in Stack");
            System.out.println("2)Peek");
            System.out.println("3)pop");
            System.out.println("4)Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number you want to add");
                    int num = sc.nextInt();
                    stack.add(num);
                    break;
                case 2:
                    stack.peek();
                    break;
                case 3:
                    stack.pop();
                    break;
                case 4:
                    break;
            }

        }

    }
    public <E> void add(E num){
        if (head.getNode() == null) {
            head.setNode( num);
        } else {
            Node node = new Node();
            node.setNode( num);
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    public <E> void pop() {
        if(head == null){
            System.out.println("The stack is empty");
        }
        else {
            Node temp = head;
            Node prev = temp;
            while (temp.getNext() != null) {
                prev = temp;
                temp = temp.getNext();
            }
            System.out.println(temp.getNode());
            if (prev == temp) {
                head = null;
            }
            prev.setNext(null);
        }
    }


    public <E> void peek() {
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        System.out.println(temp.getNode());
    }
}