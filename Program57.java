class FiveInput{
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int num1,num2,num3,num4,num5;
        System.out.println("Enter first number: ");
        num1=sc.nextInt();
        System.out.println("\nEnter second number: ");
        num2 = sc.nextInt();
        System.out.println("\nEnter third number: ");
        num3 = sc.nextInt();
        System.out.println("\nEnter fourth number: ");
        num4 = sc.nextInt();
        System.out.println("\nEnter fifth number: ");
        num5 = sc.nextInt();

        int sum = num1+num2+num3+num4+num5;
        System.out.println("Sum: "+sum);

        double avg = sum/5;
        System.out.println("Average: "+avg);
    }
}