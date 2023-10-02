class Factorial{  
    public static void main(String args[]){  
        int i,fact=1;
        
        java.util.Scanner Input = new java.util.Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int number= Input.nextInt();
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);    
    } 
}  