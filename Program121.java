class SmallestNumber{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = input.nextInt();
        System.out.print("Input the Second number: ");
        int y = input.nextInt();
        System.out.print("Input the third number: ");
        int z = input.nextInt();

        int small = Math.min(Math.min(x,y),z);
        System.out.println("Smallest number is "+small);
    }
}