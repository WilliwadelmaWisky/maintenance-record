package core;

import core.util.serialization.Serializable;

/**
 * @version 1.0 - 5.11.2023
 * @version 1.1 - 11.11.2023
 */
public class Mileage implements Serializable {

    private static final DistanceUnit DEFAULT_UNIT_TYPE = DistanceUnit.KILOMETER;

    private int _amount;
    private DistanceUnit _unitType;


    /**
     * @param amount
     * @param unitType
     */
    public Mileage(int amount, DistanceUnit unitType) {
        _amount = amount;
        _unitType = unitType;
    }

    /**
     * @param amount
     */
    public Mileage(int amount) {
        this(amount, DEFAULT_UNIT_TYPE);
    }



    /**
     * @return
     */
    @Override
    public String toString() {
        return toString(DEFAULT_UNIT_TYPE);
    }


    /**
     * @param unitType
     * @return
     */
    public String toString(DistanceUnit unitType) {
        int convertedAmount = _unitType.convert(_amount, unitType);
        return convertedAmount + " " + unitType.toString();
    }


    /**
     * @return
     */
    @Override
    public String serialize() {
        StringBuilder sb = new StringBuilder();
        sb.append(_amount);
        sb.append('|');
        sb.append(_unitType.name());
        return sb.toString();
    }

    /**
     * @param s
     */
    @Override
    public void deserialize(String s) {
        String[] props = s.split("\\|");
        _amount = Integer.parseInt(props[0].trim());
        _unitType = DistanceUnit.valueOf(props[1].trim());
    }
}
