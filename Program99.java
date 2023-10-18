import java.util.HashSet;
class UniqueElementsInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8};

        printUniqueElements(array);
    }

    public static void printUniqueElements(int[] array) {
        HashSet<Integer> uniqueElements = new HashSet();

        for (int element : array) {
            if (!uniqueElements.contains(element)) {
                uniqueElements.add(element);
                System.out.println(element);
            }
        }
    }
}
