import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHelper
{

    public static String getNowAsFormatted() {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        return sdf.format(d);
    
    }

}