package testBench.ids.kdd99.helpers;


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
    public static Date getDateFromFormattedString(String dateAsString)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(STR_DATE_FORMAT);
        sdf.setLenient(false);
        Date dt = sdf.parse(dateAsString);
        return dt;
    }
    public static String getFormattedStringFromDate(Date d)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(STR_DATE_FORMAT);
        return sdf.format(d);
    }



    public static Date getNow() {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        return d;
    }


}