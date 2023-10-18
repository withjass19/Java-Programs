class CyclicRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        cyclicallyRotateClockwise(array);

        System.out.println("Array after cyclic clockwise rotation:");
        printArray(array);
    }

    public static void cyclicallyRotateClockwise(int[] array) {
        if (array.length < 2) {
            return;
        }

        int lastElement = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = lastElement;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
