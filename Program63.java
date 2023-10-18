import java.util.Scanner;
class CheckNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("The entered number is negative.");
        } else if (num == 0) {
            System.out.println("The entered number is zero.");
        } else {
            System.out.println("The entered number is positive.");
        }
    }
}
