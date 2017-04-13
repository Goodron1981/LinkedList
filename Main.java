/**
 * Created by chernyahivskiy.v on 11.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(null,null);

        Human human5 = new Human("Anna", 28);
        linkedList.Insert(0,human5);

        Human human1 = new Human("Masha", 25);
        linkedList.Insert(2,human1);

        Human human2 = new Human("Sasha", 26);
        linkedList.add(human2);

        Human human4 = new Human("Lesha", 28);
        linkedList.add(human4);

        Human human3 = new Human("Pasha", 27);
        linkedList.Insert(3,human3);

        linkedList.List();
    }



}
