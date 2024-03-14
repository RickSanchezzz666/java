import java.util.LinkedList;
public class LinkedListClass {
    LinkedList<Integer> linkedList;
    public LinkedListClass() {
        linkedList = new LinkedList<>();
    }
    public void insertAtFront(int value) {
        linkedList.addFirst(value);
        System.out.println("You successfully inserted at the front element: " + value);
    }

    public void insertAtBack(int value) {
        linkedList.add(value);
        System.out.println("You successfully inserted at the back element: " + value);
    }
    public void deleteElement(int index) {
        if((linkedList.size() - 1) < index) return;
        var elem = linkedList.remove(index);
        System.out.println("You successfully deleted: " + elem + " with index: " + index);
    }

    public void displayList() {
        if (linkedList.isEmpty()) return;
        System.out.println("Your Linked List is: " + linkedList.toString());
    }


}
