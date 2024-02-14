package core.util;

import java.nio.file.Paths;

/**
 * @version 14.2.2024
 */
public class FileUtil {

    public static final String USER_HOME = System.getProperty("user.home");


    /**
     * @param first
     * @param more
     * @return
     */
    public static String combinePath(String first, String... more) {
        return Paths.get(first, more).toString();
    }


    public static String readAll(String filePath) {
        return "";
    }
    public static void writeAll(String filePath, String contents) { }

}
