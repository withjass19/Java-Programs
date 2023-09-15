class DecimalToBinaryNumber{
    static void decToBinary(int n)
    {
        for (int i = 3; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }

    public static void main(String[] args)
    {
        int n = 1;
        System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
        decToBinary(n);
    }
}