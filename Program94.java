import java.util.Arrays;
class SecondLowestValueOfArray{
    public static void main(String[] args) {
        int[] num;
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=input.nextInt();
        num= new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("enter element "+(i+1)+": ");
            num[i]=input.nextInt();
        }

        Arrays.sort(num);
        System.out.println("second largest numbe is "+num[1]);
    }
}