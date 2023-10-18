import java.util.Scanner;
class FindLargestAndSmallestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        int smallest = Integer.MAX_VALUE; // Initialize to the largest possible integer

        char choice;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            largest = Math.max(largest, number);
            smallest = Math.min(smallest, number);

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Largest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);
    }
}
