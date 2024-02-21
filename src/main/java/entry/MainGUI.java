package entry;

import core.util.database.Database;
import core.util.database.LocalStorage;
import core.util.FileUtil;
import gui.application.GUIApplication;

/**
 *
 */
public final class MainGUI {

    private static final String LOCATION = FileUtil.combinePath(FileUtil.USER_HOME, ".database", "maintenance_record.db");

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("MainGUI - Start");
        Database database = new Database(new LocalStorage(LOCATION));
        GUIApplication.create();

        System.out.println("MainGUI - Close");
        database.close();
    }
}
