/**
 * Created by chernyahivskiy.v on 11.04.2017.
 */
public class Node {
    private Node prev;
    private Node next;
    Human human;

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    Node(Node next, Node prev, Human human){
        this.next = next;
        this.prev = prev;
        this.human = human;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
            this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
            this.next = next;
    }
}
