import java.util.Scanner;
class CountNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        int amount = scanner.nextInt();

        int[] noteValues = {100, 50, 20, 10, 5, 1};
        int[] noteCounts = new int[noteValues.length];

        for (int i = 0; i < noteValues.length; i++) {
            noteCounts[i] = amount / noteValues[i];
            amount %= noteValues[i];
        }

        System.out.println("Count of Notes:");
        for (int i = 0; i < noteValues.length; i++) {
            System.out.println("$" + noteValues[i] + " notes: " + noteCounts[i]);
        }
    }
}
