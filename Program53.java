import java.util.Scanner;
class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int daysInMonth = getDaysInMonth(month, year);

        if (daysInMonth == -1) {
            System.out.println("Invalid month input. Please enter a number between 1 and 12.");
        } else if (daysInMonth == -2) {
            System.out.println("Invalid year input. Please enter a positive year.");
        } else {
            System.out.println("Number of days in the selected month: " + daysInMonth);
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1; // Invalid month input
        }

        if (year < 1) {
            return -2; // Invalid year input
        }

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
