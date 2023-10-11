class LeapYear{
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter a year:");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0 )|| (year%400==0)){
            System.out.println(year+" is a leap year.");
        }
        else{
            System.out.print(year + " is not a leap year");
        }
    }
}