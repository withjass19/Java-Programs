class ReverseNumber{
    public static void main(String[] args){
        int sum = 0, rem;

        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.println("Enter the number");
        int num=input.nextInt();

        System.out.println("Original number: "+num);

        while(num>0){
            rem = num%10;
            sum = sum*10+rem;
            num = num/10;
        }
        
        System.out.println("Reverse of a Number is "+sum);
    }
}