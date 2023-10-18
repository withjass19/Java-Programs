class ElectricityBill{
    public static void main(String a[]){
        float oldReading = 18;
        float newReading = 118;
        float units = newReading-oldReading;
        float fixedCharges = 40;
        float eneryDuty = 0.15f;
        float bill=0;
        if(units<=100){
            bill+=units*4;
        }
        else{
            bill+=units*5;
        }
        float totalBill = bill + fixedCharges + eneryDuty*units;
        System.out.println(totalBill);
    }
}