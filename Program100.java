import java.util.Arrays;
class ArraySortAscendingOrder{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        System.out.println("Original Array: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array in ascending Order: "+Arrays.toString(arr));
    }
}