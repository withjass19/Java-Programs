class SwapArrayElements{
    public static void main(String a[]){
        int arr[] = {1,2,3,4,3};

        System.out.println("Before swap");
        for(int x: arr){
            System.out.print(x);
        }
        System.out.println();

        int l = arr.length;
        int s = l-1;

        int temp = 0 ;
        temp = arr[0];
        arr[0]=arr[s];
        arr[s]=temp;

        System.out.println("\nAfter swapping");
        for (int j:arr)System.out.print(j + " ");
    }
}