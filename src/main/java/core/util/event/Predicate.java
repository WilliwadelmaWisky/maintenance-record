package core.util.event;


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
    boolean invoke(T obj);
}
