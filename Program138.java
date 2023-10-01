class ConvertFloatTOAbsoluteValue{
    public static void main(String args[]){
        java.util.Scanner Input = new java.util.Scanner(System.in);
        System.out.print("Enter Float value: ");
        float num = Input.nextFloat();
        System.out.println("Your value is "+num);
        System.out.println("Absolute value is "+Math.abs(num));
    }
}