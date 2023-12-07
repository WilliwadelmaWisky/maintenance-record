package core.util;

import core.serialization.Serializable;
import java.util.Calendar;

/**
 * @version 1.0 - 11.11.2023
 * @version 1.1 - 7.12.2023
 */
public class Date implements Serializable {

    private int _day;
    private int _month;
    private int _year;


    /**
     * @param day
     * @param month
     * @param year
     */
    public Date(int day, int month, int year) {
        _day = day;
        _month = month;
        _year = year;
    }

    /**
     *
     */
    private Date() { }


    public int getDay() { return _day; }
    public int getMonth() { return _month; }
    public int getYear() { return _year; }


    /**
     * @param s
     * @return
     */
    public static Date parse(String s) {
        Date date = new Date();
        date.deserialize(s);
        return date;
    }

    /**
     * @return
     */
    public static Date now() {
        Date date = new Date();
        date._day = Calendar.getInstance().get(Calendar.DATE);
        date._month = Calendar.getInstance().get(Calendar.MONTH);
        date._year = Calendar.getInstance().get(Calendar.YEAR);
        return date;
    }


    /**
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_day);
        sb.append('.');
        sb.append(_month);
        sb.append('.');
        sb.append(_year);
        return sb.toString();
    }


    /**
     * @return
     */
    @Override
    public String serialize() {
        return this.toString();
    }

    /**
     * @param s format: day.month.year
     */
    @Override
    public void deserialize(String s) {
        String[] props = s.split("\\.");
        _day = Integer.parseInt(props[0].trim());
        _month = Integer.parseInt(props[1].trim());
        _year = Integer.parseInt(props[2].trim());
    }
}
