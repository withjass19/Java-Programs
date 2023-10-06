class AverageOfThreeNumbers{
    public static void main(String args[]){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("enter first number: ");
        int num1 = input.nextInt();
        System.out.println("\nenter second number: ");
        int num2 = input.nextInt();
        System.out.println("\nenter third number: ");
        int num3 = input.nextInt();
        float avg =(num1+num2+num3)/3;
        System.out.println("\nAverage: "+avg);
    }
}