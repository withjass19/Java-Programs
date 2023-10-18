import java.util.HashSet;
import java.util.Arrays;
class FindDuplicateValues {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 4, 7};

        int[] duplicateValues = findDuplicateValues(array);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Duplicate Values: " + Arrays.toString(duplicateValues));
    }

    public static int[] findDuplicateValues(int[] array) {
        HashSet<Integer> uniqueValues = new HashSet();
        HashSet<Integer> duplicateSet = new HashSet();

        for (int value : array) {
            if (!uniqueValues.add(value)) {
                duplicateSet.add(value);
            }
        }

        int[] result = new int[duplicateSet.size()];
        int index = 0;
        for (int value : duplicateSet) {
            result[index++] = value;
        }

        return result;
    }
}
