package core;

/**
 * @version 5.11.2023
 */
public enum DistanceUnit {
    KILOMETER, MILE;

    private static final double MILE_TO_KILOMETER = 1.6093;
    private static final double KILOMETER_TO_MILE = 0.6214;


    /**
     * @param amount
     * @param toUnit
     * @return
     */
    public int convert(int amount, DistanceUnit toUnit) {
        if (this.equals(toUnit))
            return amount;

        return switch (toUnit) {
            case KILOMETER -> (int)Math.round(amount * MILE_TO_KILOMETER);
            case MILE -> (int)Math.round(amount * KILOMETER_TO_MILE);
        };
    }


    @Override
    public String toString() {
        return switch (this) {
            case KILOMETER -> "km";
            case MILE -> "mi";
        };
    }
}
