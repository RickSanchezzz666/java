import java.util.ArrayList;
public class SelectionSort {
    public static void selectionSort(ArrayList<Integer> array) {
        for (int step = 0; step < array.size(); step++) {
            int min = step;
            for (int i = step + 1; i < array.size(); i++) {
                if (array.get(min) > array.get(i)) {
                   min = i;
                }
            }
            int temp = array.get(step);
            array.set(step, array.get(min));
            array.set(min, temp);
        }
    }
}
