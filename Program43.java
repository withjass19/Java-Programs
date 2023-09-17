import java.util.Scanner;
class SumOfN_Numbers{
    public static void main(String[] args) {
        int sum = 0;
        Scanner Input = new Scanner (System.in);
        System.out.println("Enter the number of terms you want sum");
        int n=Input.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the "+n+" numbers ");
        for(int i=0;i<n;i++){ 
            System.out.print("Enter number "+(i+1)+" : ");
            arr[i] = Input.nextInt();
        }

        for(int i=0;i<n;i++){
            sum +=arr[i];
        }
 
        System.out.println("sum of "+n+" numbers is "+sum); 
        
    }
}