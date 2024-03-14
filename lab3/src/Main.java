import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();

        list.insertAtBack(5);
        list.insertAtFront(12);
        list.insertAtFront(7);
        list.insertAtFront(30);

        list.displayList();

        list.deleteElement(2); // 3 element 2 index

        list.displayList();

        HashStructures hash = new HashStructures();

        hash.fillHashSet();
        hash.fillHashMap();

        HashSet<Integer> clonedHashSet = hash.cloneHashSet();
        HashMap<Integer, String> clonedHashMap = hash.cloneHashMap();

        hash.displayHashStructure(clonedHashSet);
        hash.displayHashStructure(clonedHashMap);
    }
}