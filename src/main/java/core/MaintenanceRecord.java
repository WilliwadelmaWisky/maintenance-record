package core;

import core.serialization.Serializable;
import core.util.Date;
import core.util.UniqueID;

/**
 * @version 1.0 - 5.11.2023
 * @version 1.1 - 11.11.2023
 */
public class MaintenanceRecord implements Serializable {

    private final UniqueID _id;
    private final Date _date;
    private final Mileage _mileage;
    private final Dealership _dealership;




    /**
     * @param date
     * @param mileage
     * @param dealership
     */
    public MaintenanceRecord(Date date, Mileage mileage, Dealership dealership) {
        _id = new UniqueID();
        _date = date;
        _mileage = mileage;
        _dealership = dealership;
    }

    /**
     * @param mileage
     * @param dealership
     */
    public MaintenanceRecord(Mileage mileage, Dealership dealership){
        this(Date.now(), mileage, dealership);
    }

    /**
     *
     */
    public MaintenanceRecord() {
        this(new Mileage(0), new Dealership());
    }


    public Date getDate() { return _date; }
    public Mileage getMileage() { return _mileage; }
    public Dealership getDealership() { return _dealership; }


    /**
     * @return
     */
    @Override
    public String serialize() {
        StringBuilder sb = new StringBuilder();
        sb.append(_id.serialize());
        sb.append(';');
        sb.append(_date.serialize());
        sb.append(';');
        sb.append(_mileage.serialize());
        sb.append(';');
        sb.append(_dealership.serialize());
        return sb.toString();
    }

    /**
     * @param s
     */
    @Override
    public void deserialize(String s) {
        String[] props = s.split(";");
        _id.deserialize(props[0]);
        _date.deserialize(props[1]);
        _mileage.deserialize(props[2]);
        _dealership.deserialize(props[3]);
    }
}
