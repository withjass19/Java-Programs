import java.util.Scanner;
class Average{
    public static void main(String a[]){
        Scanner in = new Scanner(System.in);
   
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
        
        System.out.print("Input third number: ");
        int num3 = in.nextInt();
        
        System.out.print("Input fourth number: ");
        int num4 = in.nextInt();
        
        System.out.print("Enter fifth number: ");
        int num5 = in.nextInt();
        
        int avg = ((num1 + num2 + num3 + num4 + num5) / 5);
        
        System.out.println("Average of five numbers is: " + avg);
    }
}