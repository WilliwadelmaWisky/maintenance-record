package core.util.database;

import core.util.serialization.Serializable;

/**
 *
 */
public interface Model extends Serializable {
    String getPrimaryKey();
}
