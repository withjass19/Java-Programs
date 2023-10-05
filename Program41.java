class AverageMarks{
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n=input.nextInt();
        
        double[] mark=new double[n];

        for(int i=0;i<n;i++){
            System.out.printf("Enter Marks %d : ",i+1);
            mark[i]=input.nextDouble();
        }

        double sum=0,average;

        for (double m:mark){sum+=m;}

        average=(float)(sum/n);

        System.out.println("Your Average marks is "+average);

    }
}