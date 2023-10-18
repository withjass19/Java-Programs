import java.util.Scanner;
class calculateBattingAverage{
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the total number of hits:");
       int totalHits = scanner.nextInt();

       System.out.println("Enter the total number of at-bats:");
       int totalAtBats = scanner.nextInt();

       double battingAverage = Average(totalHits, totalAtBats);
       System.out.println("The calculated batting average is: " + battingAverage);

       scanner.close();
   }

   private static double Average(int totalHits, int totalAtBats) {
       return (double) totalHits / totalAtBats;
   }
}