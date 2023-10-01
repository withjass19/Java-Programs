class FloatRoundOfValue{
    public static void main(String args[]){
        java.util.Scanner Input = new java.util.Scanner(System.in);
        System.out.print("Enter a Float value: ");
        float num = Input.nextFloat();
        System.out.println("Your value: "+num);
        System.out.println("Round-off value: "+Math.round(num));
    }
}