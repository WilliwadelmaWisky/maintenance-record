package core;

/**
 * @version 26.11.2023
 */
public class Transmission {

    /**
     * @version 26.11.2023
     */
    public enum Type {
        MT, AT, CVT
    }

    private String _typeCode;
    private Type _type;
    private int _gears;
}
