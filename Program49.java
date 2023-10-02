class Calculate_Commission{
    float formula(float cp, float a){
        return ((cp/100)*a);
    }
}

class CommissionValue{
    public static void main(String args[]){
        float cp;
        float a;

        java.util.Scanner Input = new java.util.Scanner(System.in);

        System.out.println("Enter the commision percentage: ");
        cp = Input.nextFloat();

        System.out.println("Enter the Amount: ");
        a = Input.nextFloat();

        Calculate_Commission CA = new Calculate_Commission();
        float ans = CA.formula(cp,a);

        System.out.println("Commission amount: "+ans);
    }
}