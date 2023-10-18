class SecondsConveter{
    public static void main(String args[]){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;
        System.out.println("Hours: " + hours);

        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;
        System.out.println("Minutes: " + minutes);
        
        int seconds = remainingSeconds % 60;       
        System.out.println("Seconds: " + seconds);
    }
}