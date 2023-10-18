class TestIfDoubleIsInteger {
    public static void main(String[] args) {
        double number1 = 5.0;
        double number2 = 7.5;

        testIfInteger(number1);
        testIfInteger(number2);
    }

    public static void testIfInteger(double number) {
        if (number == (int) number) {
            System.out.println(number + " is an integer.");
        } else {
            System.out.println(number + " is not an integer.");
        }
    }
}
