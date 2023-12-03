package core.util;

import java.nio.file.Paths;

/**
 * @version 1.0 - 3.12.2023
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

}
