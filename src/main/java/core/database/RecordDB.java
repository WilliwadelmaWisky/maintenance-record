package core.database;

import core.util.FileUtil;

/**
 * @version 13.2.2024
 */
public final class RecordDB extends LocalDB {
    public static final RecordDB Current = new RecordDB();




    private RecordDB() {
        super();
    }
}
