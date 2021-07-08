package Interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Interview {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM-dd-yyyy");
        Date date = sdf.parse("6/14/2021");
        System.out.println(date);
    }
}
