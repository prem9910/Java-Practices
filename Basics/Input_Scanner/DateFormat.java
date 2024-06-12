package Input_Scanner;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    private DateFormat format;
    
    public DateFormat(String pattern) {
        this.format = new SimpleDateFormat(pattern);
    }
    
    public String format(Date date) {
        return format.format(date);
    }
    
    public static void main(String[] args) {
        DateFormat dateFormat = new DateFormat("dd-MM-yyyy");
        String date = dateFormat.format(new Date());
        
        System.out.println("Formatted Date: " + date);
    }
}
