package core;

import core.util.serialization.Serializable;
import core.util.Date;

/**
 * @version 26.11.2023
 */
public class Registration implements Serializable {

    private final Date _firstRegistrationDate;
    private String _registrationPlate;


    /**
     * @param firstRegistrationDate
     * @param registrationPlate
     */
    public Registration(Date firstRegistrationDate, String registrationPlate) {
        _firstRegistrationDate = firstRegistrationDate;
        _registrationPlate = registrationPlate;
    }


    public Date getFirstRegistrationDate() { return _firstRegistrationDate; }
    public String getRegistrationPlate() { return _registrationPlate; }


    /**
     * @return
     */
    @Override
    public String serialize() {
        StringBuilder sb = new StringBuilder();
        sb.append(_firstRegistrationDate.serialize()); sb.append(';');
        sb.append(_registrationPlate);
        return sb.toString();
    }

    /**
     * @param s
     */
    @Override
    public void deserialize(String s) {
        String[] props = s.split(";");
        _firstRegistrationDate.deserialize(props[0].trim());
        _registrationPlate = props[1].trim();
    }
}
