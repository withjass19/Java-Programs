import java.util.Scanner;
class LineCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string with multiple lines: ");
        String inputString = input.nextLine();

        int lineCount = countLines(inputString);

        System.out.println("Total number of lines: " + lineCount);
    }

    public static int countLines(String input) {
        String[] lines = input.split("\n");
        
        return lines.length;
    }
}
