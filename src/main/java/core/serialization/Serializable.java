package core.serialization;

/**
 * @version 11.11.2023
 */
public interface Serializable {

    /**
     * @return
     */
    String serialize();

    /**
     * @param s
     */
    void deserialize(String s);
}
