package core.event;

import core.CarRecord;

/**
 * @version 3.12.2023
 */
@FunctionalInterface
public interface SaveCallback {

    /**
     * @param record
     */
    void invoke(CarRecord record);
}
