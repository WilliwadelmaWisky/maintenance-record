package core.util.event;

/**
 *
 * @param <T>
 */
public interface ActionGen<T> {

    /**
     *
     * @param arg
     */
    void invoke(T arg);
}
