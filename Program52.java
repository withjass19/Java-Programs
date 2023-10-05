class LargestNumber{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter First number:");
        num1=input.nextInt();
        System.out.println("\nEnter Second number:");
        num2=input.nextInt();
        System.out.println("\nEnter third number:");
        num3=input.nextInt();
        System.out.println("\n\n");
        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest number.");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest number.");

        else
            System.out.println(num3 + " is the largest number.");
    }
}