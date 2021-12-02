package dateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        Date date = new Date();
//        System.out.println((simpleDateFormat.format(date)));
        String dateStr = "23/01/2007";
        Date parse = sdf.parse(dateStr);
        System.out.println(parse);

    }
}

