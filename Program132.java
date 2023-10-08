class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5;
        long factorial = Factorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
}
