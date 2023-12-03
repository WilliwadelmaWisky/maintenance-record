package core.event;

import core.CarRecord;

/**
 * @version 3.12.2023
 */
@FunctionalInterface
public interface SearchCallback {

    /**
     * @param s
     * @return
     */
    CarRecord invoke(String s);
}
