package homework9;

public class Node {
    String actual;
    Node next;
    Node previous;

    public Node(String actual, Node previous, Node next) {
        this.actual = actual;
        this.next = next;
        this.previous = previous;
    }

}
