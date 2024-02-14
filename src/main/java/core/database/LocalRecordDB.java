package core.database;

import core.util.FileUtil;

/**
 * @version 14.2.2024
 */
public final class LocalRecordDB extends Database {
    public static final LocalRecordDB Current = new LocalRecordDB();
    private static final String LOCATION = FileUtil.combinePath(FileUtil.USER_HOME,".databases", "maintenance_record.db");


    /**
     *
     */
    private LocalRecordDB() {
        super(new RecordProvider(), new LocalStorage(LOCATION));
    }
}
