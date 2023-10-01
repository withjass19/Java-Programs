class EvenNumber{
    public static void main(String args[]){
        java.util.Scanner Input = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Input.nextInt();
        if(num%2==0){
            System.out.println("Yes, your number is even");
        }
        else{
            System.out.println("No, your number is not even");
        }
    }
}