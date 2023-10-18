class ArrayValue{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int value = 5;
        int num = 0;
        for (int i : arr) {
            if(i==value){
                num = 1;
                // System.out.println("The array contains the value " + value);
                break;
            }
            else{
                num = 0;
                continue;
                // System.out.println("The array does not contain the value " + value);
            }
        }
        if(num == 0){
            System.out.println("The array does not contain the value " + value);
        }
        else{
            System.out.println("The array contains the value " + value);
        }
    }
}