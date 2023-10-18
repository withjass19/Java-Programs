class SegregateZerosAndOnes {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 0, 1, 0, 0, 1, 1};

        segregateZerosAndOnes(array);

        System.out.println("Array after segregation: ");
        printArray(array);
    }

    public static void segregateZerosAndOnes(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (array[left] == 0 && left < right) {
                left++;
            }

            while (array[right] == 1 && left < right) {
                right--;
            }

            if (left < right) {
                array[left] = 0;
                array[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
