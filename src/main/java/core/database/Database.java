package core.database;

/**
 * @version 13.2.2024
 */
public interface Database {
    void insert(String tableName, Model model);
    void modify(String tableName, Model model);
    void delete(String tableName, String key);
}
