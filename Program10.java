class SumOfDigitNumbers{
    public static void main(String[] args){
        int num = 123;
        int digit;
        int sum = 0;

        while(num > 0){
            digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}