class RoundUpDivisionResult {
    public static void main(String[] args) {
        int dividend = 17;
        int divisor = 5;

        int result = roundUpDivision(dividend, divisor);

        System.out.println("Result of " + dividend + " / " + divisor + " (rounded up): " + result);
    }

    public static int roundUpDivision(int dividend, int divisor) {
        int result = dividend / divisor;

        if (dividend % divisor > 0) {
            result++;
        }

        return result;
    }
}
