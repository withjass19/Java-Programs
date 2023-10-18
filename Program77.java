import java.util.Scanner;
class CharacterAtIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        System.out.print("Enter the index to get the character: ");
        int index = input.nextInt();

        if (index >= 0 && index < inputString.length()) {
            char character = inputString.charAt(index);
            System.out.println("Character at index " + index + " is: " + character);
        } else {
            System.out.println("Invalid index. Please check the index value.");
        }
    }
}
