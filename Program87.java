import java.util.Arrays;
class InsertElementInArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6};
        int insertElement = 99; 
        int insertPosition = 3; 

        if (insertPosition < 0 || insertPosition > originalArray.length) {
            System.out.println("Invalid insert position.");
            return;
        }

        int[] newArray = new int[originalArray.length + 1];

        for (int i = 0, j = 0; i < originalArray.length; i++, j++) {
            if (j == insertPosition) {
                newArray[j] = insertElement;
                j++;
            }
            newArray[j] = originalArray[i];
        }
        if (insertPosition == originalArray.length) {
            newArray[newArray.length - 1] = insertElement;
        }

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }
}
