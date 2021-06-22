import java.util.Scanner;

public class Stack {
    Node head = new Node();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

        int choice = 0;
        while (choice != 3) {

            System.out.println("1)Add number in Stack");
            System.out.println("2)Print Stack");
            System.out.println("3)Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number you want to add");
                    int num = sc.nextInt();
                    stack.add(num);
                    break;
                case 2:
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
}