package core;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * @version 5.11.2023
 */
public class MaintenanceRecord {

    private final String _id;
    private final Date _date;
    private final Mileage _mileage;
    private final String _dealership;


    public MaintenanceRecord() {
        _id = UUID.randomUUID().toString();
        _date = new Date(2023, Calendar.NOVEMBER, 5);
        _mileage = new Mileage(120050);
        _dealership = "Dealershippppp";
    }


    public Date getDate() { return _date; }
    public Mileage getMileage() { return _mileage; }
    public String getDealership() { return _dealership; }
}
