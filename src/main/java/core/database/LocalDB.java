package core.database;

import core.util.FileUtil;

import java.util.Dictionary;
import java.util.HashMap;

/**
 * @version 13.2.2024
 */
public abstract class LocalDB implements Database {

    private static final String LOCATION = FileUtil.combinePath(FileUtil.USER_HOME,".databases", "maintenance_record.db");

    private HashMap<String, Table> _tableDictionary;


    /**
     *
     */
    protected LocalDB() {
        _tableDictionary = new HashMap<String, Table>();
        String content = FileUtil.readAll(LOCATION);
    }


    @Override
    public void insert(String tableName, Model model) {
        if (tableName.isEmpty() || model == null || !_tableDictionary.containsKey(tableName))
            return;

        Table table = _tableDictionary.get(tableName);
        table.insert(model);
    }

    @Override
    public void modify(String tableName, Model model) {

    }

    @Override
    public void delete(String tableName, String key) {

    }
}
