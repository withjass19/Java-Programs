class TestNumber{
    public static void main(String args[]){
        int num;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        if(num > 0){
           System.out.println(num+" is positive.");
        }
        else if(num < 0){
            System.out.println(num+" is negative.");
        }
        else{
            System.out.println(num+" is zero.");
        }
    }
}