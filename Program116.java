class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int number = 1; number <= 600; number++) {
            if (isArmstrongNumber(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0;
        int n = 0;

        originalNumber = number;

        for (originalNumber = number; originalNumber != 0; originalNumber /= 10) {
            n++;
        }

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        return result == number;
    }
}
