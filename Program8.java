class BinaryToDecimal
{
    public static void main(String argsp[]) throws NumberFormatException
    {
        // int ans =0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter your binary number : ");
        String binary=sc.next();

        //Using inbuilt functions.
        int decimal=Integer.parseInt(binary,2);

        //Using while loop.

        /* while(binary!=0)
        {
            int digit = binary % 10;
            if(digit == 1)
            ans = ans + (int)(Math.pow(2,i));
            binary = binary / 10;
            i++;
        }*/
        System.out.println("Decimal number for Binary "+binary+" is "+decimal);
    }
}