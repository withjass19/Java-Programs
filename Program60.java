class FindingCube{
    public static void main(String args[]){
       System.out.println("Enter a number: ");
       java.util.Scanner sc = new java.util.Scanner(System.in);
       int num = sc.nextInt();
       System.out.println("Cube of the given number is "+(num*num*num));
    }
 }