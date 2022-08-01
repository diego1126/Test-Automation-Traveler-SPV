package co.com.castor.spv.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateDate {
    private int numDay;

    public static String Calculate_d1(int numDay) {
        Date fecha = new Date();
        int day_1 = (fecha.getDate());
        day_1 = day_1 + numDay;
        return "//td/div[contains(text(),'"+String.valueOf(day_1)+"')]";
    }

    public String Calculate_d2(int numDay) {
        numDay = numDay;
        Date fecha = new Date();
        int day_1 = (fecha.getDate());
        if(day_1 <= 27) {
            int day_2 = day_1 + numDay;
            return "//td/div[contains(text(),'"+String.valueOf(day_2)+"')]";
        }else {
            int day_2 = 5;
            return "//td/div[contains(text(),'"+String.valueOf(day_2)+"')]";
        }
    }


    public String DateWihtName_1() {
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        Date fecha = new Date();
        int day_1 = (fecha.getDate());
        int month = (fecha.getMonth());
        String currentYear = getYearFormat.format(fecha);
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return "//td[@aria-label='"+monthName[month]+" "+String.valueOf(day_1)+","+" "+String.valueOf(currentYear)+"']";
    }

    public String DateWihtName_2(int numDay) {
        this.numDay = numDay;
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        Date fecha = new Date();
        int day_1 = (fecha.getDate());
        int month = (fecha.getMonth());
        String currentYear = getYearFormat.format(fecha);
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if(day_1 <= 28) {
            int day_2 = day_1 + numDay;
            return "//td[@aria-label='"+monthName[month]+" "+String.valueOf(day_2)+","+" "+String.valueOf(currentYear)+"']";
        }else {
            int day_2 = 5;
            return "//td[@aria-label='"+monthName[month+1]+" "+String.valueOf(day_2)+","+" "+String.valueOf(currentYear)+"']";
        }

    }

}
