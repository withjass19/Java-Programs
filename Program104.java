class SearchArrayElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        int key = 40;

        int index = searchKeyElement(array, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }

    public static int searchKeyElement(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
