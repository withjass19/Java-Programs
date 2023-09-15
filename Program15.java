// import java.lang.System;
import java.util.Calendar;
class CurrentTime{
    public static void main(String a[]){
        Calendar cal = Calendar.getInstance();
        int hour=cal.get(Calendar.HOUR);
        int minute=cal.get(Calendar.MINUTE);
        System.out.println("Current Time is : "+hour+":"+minute);
        // System.out.print(System.currentTimeMillis());
    }
}