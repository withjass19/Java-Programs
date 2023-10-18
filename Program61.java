class OddNumbers{
    public static void main(String args[]){
        int i, n, sum = 0;
        System.out.print("Input number of terms is: ");

        java.util.Scanner input = new java.util.Scanner(System.in);
        n=input.nextInt();

        System.out.println ("\nThe odd numbers are :");
        for(i=1;i<=n;i++){
            System.out.println (2*i-1);
            sum+=2*i-1;
        }

        System.out.println ("The Sum of odd Natural Number upto " +n+" terms is: " +sum);
    }
}