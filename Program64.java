import java.util.Scanner;
class CountDigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            String numStr = Integer.toString(num);
            int digits = numStr.length();

            System.out.println("Number of digits: " + digits);
        }
    }
}
