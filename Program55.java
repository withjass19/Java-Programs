class WeekDays{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int day;
        System.out.println("Enter the number of week's days(1-7): ");
        day=input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please enter right number.");
        }
    }
}