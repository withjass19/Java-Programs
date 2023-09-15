class PrintEvenNumbers{
    static void printEvenNumbers(int n){
        System.out.println("Odd Numbers:");
        for(int i=1; i<=n; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String a[]){
        printEvenNumbers(20);
    }
}