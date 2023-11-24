package core.util;

/**
 * @version 24.11.2023
 */
public class EnumUtil {

    /**
     * Get names of all enum values
     * @param enumClass
     * @return
     */
    public static String[] getNames(Class<? extends Enum<?>> enumClass) {
        if (enumClass == null)
            return null;

        Enum<?>[] values = enumClass.getEnumConstants();
        String[] names = new String[values.length];
        for (int i = 0; i < values.length; i++)
            names[i] = values[i].name();

        return names;
    }
}
