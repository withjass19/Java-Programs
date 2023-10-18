class ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseIntArray(originalArray);

        System.out.print("Original Array: ");
        printIntArray(originalArray);

        System.out.print("Reversed Array: ");
        printIntArray(reversedArray);
    }
    public static int[] reverseIntArray(int[] arr) {
        int length = arr.length;
        int[] reversed = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = arr[length - 1 - i];
        }
        return reversed;
    }
    public static void printIntArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
