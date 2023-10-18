class PrimeNumbers{
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;
        System.out.println("Prime numbers between 1 and 20 are:");
        for (i = 2; i <= 20; i++) {
            isPrime = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
