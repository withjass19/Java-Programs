class SwapTwoVariables{
    public static void main(String a[]){

        int x = 1, y = 2;
        
        System.out.println("Before swap");
        System.out.println("x = " + x + "\ny = " + y);

        int temp = x;
        x = y;
        y=temp;

        System.out.println("\n\nAfter swap");
        System.out.println("x = " + x + "\ny = " + y);

    }
}