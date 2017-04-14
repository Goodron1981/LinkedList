/**
 * Created by chernyahivskiy.v on 11.04.2017.
 */
public class LinkedList {
    private Node first;
    private Node last;
    int size = 0;

    LinkedList(Node first, Node last){
        this.first = first;
        this.last = last;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void add(Human human){
        if (size == 0){
        Node node = new Node(null, null, human);
         first =  node;
         last =  node;
        }else {
            Node node = new Node(null, this.last, human);
            last.setNext(node);
            node.setPrev(last);
            last =  node;
        }
        size++;
    }
    public void Insert(int position, Human human){
        if (size == 0 || position>=size){
            add(human);
        }else{
            Node tabo = first;
            for (int i=0; i<position; i++){
                tabo = tabo.getNext();
            }
            Node node = new Node(null,null, human);
            node.setPrev(tabo.getPrev());
            if(tabo.getPrev()!=null) {
                tabo.getPrev().setNext(node);
            }
            node.setNext(tabo);
            tabo.setPrev(node);
            size++;
            if (position < 2){
                //first = node;
            }
        }
    }
    public void  List (){
        Node tmp = first;
        int i = 0;
            while (tmp!= null) {
                System.out.println("Элемент " + i + ":" + tmp.getHuman().getName());
                i++;
                tmp = tmp.getNext();
            }
    }
    public Node SearchByPos(int position) {
        Node srch;
        if ( position == 0 || position < (double)size / 2) {
            srch = first;
            for (int i = 0; i < position; i++) {
                srch = srch.getNext();
            }
        } else {
            srch = last;
            for (int i = size - position; i > 1; i--) {
                srch = srch.getPrev();
            }
        }
            return srch;

        }
    }
