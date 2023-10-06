import java.math.BigDecimal;
class Decimals{
    public static void main(String args[]){
        float x = 123.45678f;
        System.out.println("Before rounding : " +x);

        BigDecimal result;
        int DECIMAL_PLACE = 2;
        BigDecimal num = new BigDecimal(Float.toString(x));
        num = num.setScale(DECIMAL_PLACE, BigDecimal.ROUND_HALF_UP);
        System.out.println("\nAfter Rounding: "+num+"\n");
    }
}