class ArrayDifference {
    public static void main(String[] args) {
        int[] array = {12, 5, 9, 20, 3, 16, 8};

        int difference = findDifference(array);

        System.out.println("Array: " + arrayToString(array));
        System.out.println("Difference between largest and smallest values: " + difference);
    }

    public static int findDifference(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int min = array[0];
        int max = array[0];

        for (int value : array) {
            if (value < min) {
                min = value;
            } else if (value > max) {
                max = value;
            }
        }

        return max - min; 
    }

    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
