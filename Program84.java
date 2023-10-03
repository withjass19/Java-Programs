class AverageValueOfArray{
    public static void main(String[] args) {
        int[] num;
        int sum = 0;
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=input.nextInt();
        num= new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("enter element "+(i+1)+": ");
            num[i]=input.nextInt();
        }
        for(int i = 0; i < n; i++){
            sum = sum + num[i];
        }
        System.out.println("Sum of values: "+sum);
        double avg=(double)(sum/n); //this is wrong, because it will give you a float value which may not be
        System.out.println("Average of values: "+avg);
    }
}