class Calculate_Compound_Interest{
    double formula(double p, double r, double t){
        double CI = p*(Math.pow((1+r/100),t));
        return CI;
    }
}

class CompoundInterest{
    public static void main(String args[]) {
        double p;
        double r;
        double t;
        java.util.Scanner Input = new java.util.Scanner(System.in);
        //Input the Principal Amount:
        System.out.print("Enter principle: ");
        p = Input.nextDouble();
        System.out.print("\nEnter Rate: ");
        r = Input.nextDouble();
        System.out.print("\nEnter Time(In Year): ");
        t = Input.nextDouble();

        System.out.println("Principle is "+p+" , "+"Rate is "+r+" and time is "+t);

        Calculate_Compound_Interest CI = new Calculate_Compound_Interest();
        double ans = CI.formula(p,r,t);
        System.out.println("Compound Interest: "+ans);
    }
}