class DigitSum{
    public static void main(String a[]){
        int x =1453;
        int sum =0;
        while(x!=0){
            int i=x%10;
            sum+=i;
            x=x/10;
        }
        System.out.println(sum);
    }
}