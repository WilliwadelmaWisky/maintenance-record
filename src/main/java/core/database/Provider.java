package core.database;

/**
 * @param <T>
 */
public interface Provider<T extends Table> {
    void store(Storage storage, Iterable<T> tables);
    Iterable<T> load(Storage storage);
}
