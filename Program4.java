class Calculate{
    static int SumTwoNumbers(int a, int b){
        return (a+b);
    }

    static int SubstractTwoNumbers(int a, int b){
        return (a-b);
    }

    static int MultiplyTwoNumbers(int a, int b){
        return (a*b);
    }

    static int DivideTwoNumbers(int a, int b){
        return (a/b);
    }

    static int RemainderTwoNumbers(int a, int b){
        return (a%b);
    }

    public static void main(String a[]){
        System.out.print("Sum of Two numbers: "+ SumTwoNumbers(6,5));
        System.out.print("\nSubstract of Two numbers: "+ SubstractTwoNumbers(6,5));
        System.out.print("\nMultiply of Two numbers: "+ MultiplyTwoNumbers(6,5));
        System.out.print("\nDivide Two numbers: "+ DivideTwoNumbers(6,5));
        System.out.print("\nRemaider of Two numbers: "+ RemainderTwoNumbers(6,5));

    }
}