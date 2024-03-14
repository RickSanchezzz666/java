import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(6);
        array.add(3);
        array.add(1);
        array.add(2);
        array.add(7);
        array.add(6);
        array.add(13);

        SelectionSort.selectionSort(array);

        System.out.println(array.toString());
    }
}