package core;

/**
 * @version 5.11.2023
 */
public class Mileage {

    private static final DistanceUnit DEFAULT_UNIT_TYPE = DistanceUnit.KILOMETER;

    private final int _amount;
    private final DistanceUnit _unitType;


    /**
     * @param amount
     */
    public Mileage(int amount) {
        this(amount, DEFAULT_UNIT_TYPE);
    }

    /**
     * @param amount
     * @param unitType
     */
    public Mileage(int amount, DistanceUnit unitType) {
        _amount = amount;
        _unitType = unitType;
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
}
