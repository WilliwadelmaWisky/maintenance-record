package core.database;

import java.util.HashMap;

/**
 * @version 14.2.2024
 */
public class Database {
    private HashMap<String, Table> _tableDictionary;


    public Database(Provider<Table> provider, Storage storage) {
        _tableDictionary = new HashMap<String, Table>();
        Iterable<Table> tables = provider.load(storage);

        for (Table table : tables) {
            _tableDictionary.put(table.getName(), table);
        }
    }


    public void insert(String tableName, Model model) {
        if (tableName.isEmpty() || model == null || !_tableDictionary.containsKey(tableName))
            return;

        Table table = _tableDictionary.get(tableName);
        table.insert(model);
    }
    public void modify(String tableName, Model model) {

    }
    public void delete(String tableName, String key) {
        if (tableName.isEmpty() || key.isEmpty() || !_tableDictionary.containsKey(tableName))
            return;

        Table table = _tableDictionary.get(tableName);
        table.delete(key);
    }
}
