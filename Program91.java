import java.util.ArrayList;
import java.util.Arrays;
class ArrayToArrayList {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry", "date"};

        ArrayList<String> arrayList = convertArrayToArrayList(array);
        System.out.println("ArrayList: " + arrayList);
    }

    public static <T> ArrayList<T> convertArrayToArrayList(T[] array) {
        ArrayList<T> arrayList = new ArrayList(Arrays.asList(array));

        return arrayList;
    }
}
