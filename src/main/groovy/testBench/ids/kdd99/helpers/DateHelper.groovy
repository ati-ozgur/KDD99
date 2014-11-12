import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHelper
{

    public static final String STR_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String getNowAsFormatted() {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        
        SimpleDateFormat sdf = new SimpleDateFormat(STR_DATE_FORMAT);
        return sdf.format(d);
    
    }
    public static Date getNowAsFormatted() {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        return d;
    }


}