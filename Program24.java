class PalindromeNumber{
    public static void main(String args[]){
        int new_num = 0;
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = input.nextInt();

        int Original_num = num;

        if(num<0){
            System.out.println("Please enter a positive number.");
        }
        else{
            while(num>0){
                int digit = num % 10;
                new_num = new_num * 10 + digit;
                num /= 10;
            }
            if(Original_num == new_num){
                System.out.println(Original_num+" is palindrome");
            }
            else{
                System.out.println(Original_num+" is not palindrome");
            }
        }
    }
}