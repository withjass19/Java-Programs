import java.util.Arrays;
class CommonElementsInArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Common Elements: " + Arrays.toString(commonElements));
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        int maxLength = Math.min(array1.length, array2.length);
        int[] result = new int[maxLength];

        int count = 0;

        for (int element : array1) {
            if (containsElement(array2, element)) {
                result[count] = element;
                count++;
            }
        }
        result = Arrays.copyOf(result, count);

        return result;
    }

    public static boolean containsElement(int[] array, int element) {
        for (int value : array) {
            if (value == element) {
                return true;
            }
        }
        return false;
    }
}
