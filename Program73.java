import java.util.Scanner;
class SubstringExample{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        System.out.print("Enter the starting position: ");
        int startIndex = input.nextInt();

        System.out.print("Enter the ending position: ");
        int endIndex = input.nextInt();

        if (startIndex < 0 || endIndex > originalString.length() || startIndex > endIndex) {
            System.out.println("Invalid input. Please check the positions.");
        } else {
            String substring = originalString.substring(startIndex, endIndex);
            System.out.println("Substring: " + substring);
        }
    }
}
