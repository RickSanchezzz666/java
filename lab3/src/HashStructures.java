import java.util.HashSet;
import java.util.HashMap;
public class HashStructures {
    HashSet<Integer> hashSet;
    HashMap<Integer, String> hashMap;
    public HashStructures() {
        hashSet = new HashSet<>();
        hashMap = new HashMap<>();
    }

    public void fillHashSet() {
        hashSet.add(12);
        hashSet.add(5);
        hashSet.add(7);
    }

    public void fillHashMap() {
        hashMap.put(5, "key1");
        hashMap.put(7, "key2");
        hashMap.put(9, "key3");
    }

    public HashSet<Integer> cloneHashSet() {
        return new HashSet<>(hashSet);
    }

    public HashMap<Integer, String> cloneHashMap() {
        return new HashMap<>(hashMap);
    }

    public void displayHashStructure(HashSet<Integer> set) {
        System.out.println("Your hash set is: " + set);
    }

    public void displayHashStructure(HashMap<Integer, String> map) {
        System.out.println("Your hash map is: " + map);
    }
}
