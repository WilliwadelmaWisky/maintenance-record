package core;

import core.serialization.Serializable;

/**
 * @version 11.11.2023
 */
public class Dealership implements Serializable {

    private String _name;


    /**
     *
     */
    public Dealership() { }

    /**
     * @param name
     */
    public Dealership(String name) {
        _name = name;
    }


    public String getName() { return _name; }


    /**
     * @param s
     * @return
     */
    public static Dealership parse(String s) {
        Dealership dealership = new Dealership();
        dealership.deserialize(s);
        return dealership;
    }


    /**
     * @return
     */
    @Override
    public String serialize() {
        return _name;
    }

    /**
     * @param s
     */
    @Override
    public void deserialize(String s) {
        _name = s.trim();
    }
}
