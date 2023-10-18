import java.util.Date;
import java.text.SimpleDateFormat;
class CurrentDateTime {
    public static void main(String[] args) {
        Date currentDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String formattedDateTime = dateFormat.format(currentDate);

        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}
