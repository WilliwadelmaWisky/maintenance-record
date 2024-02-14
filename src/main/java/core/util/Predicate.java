package core.util;


/**
 * @version 14.2.2024
 * @param <T>
 */
@FunctionalInterface
public interface Predicate<T> {

    /**
     * @param obj
     * @return
     */
    boolean call(T obj);
}
