import java.util.Arrays;
import java.util.Collections;
class SortArrayDescending {
    public static void main(String[] args) {
        Integer[] array = {10, 5, 8, 1, 7, 4};

        Arrays.sort(array);

        //descending order
        Collections.reverse(Arrays.asList(array));

        System.out.println("Array in descending order: " + Arrays.toString(array));
    }
}
