public class usingLL {
    private Node top;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public usingLL() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        } else {
            int value = top.data;
            top = top.next;
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        } else {
            return top.data;
        }
    }

    public boolean isEmpty() {
        return (top == null);
    }
}
