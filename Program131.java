class GCDandLCMCalculator {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}
