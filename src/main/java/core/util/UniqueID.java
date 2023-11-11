package core.util;

import core.serialization.Serializable;
import java.util.UUID;

/**
 * @version 11.11.2023
 */
public final class UniqueID implements Serializable {

    private String _value;


    /**
     *
     */
    public UniqueID() {
        _value = UUID.randomUUID().toString();
    }


    public String get() { return _value; }
    public void set(String s) { _value = s; }


    /**
     * @return
     */
    @Override
    public String serialize() {
        return _value;
    }

    /**
     * @param s
     */
    @Override
    public void deserialize(String s) {
        _value = s.trim();
    }
}
