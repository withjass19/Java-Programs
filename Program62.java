class MultiplicationTable{
    public static void main(String args[]){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter number for multiplication table: ");
        int n = input.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}