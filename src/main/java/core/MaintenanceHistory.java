package core;

import core.serialization.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0 - 24.11.2023
 */
public class MaintenanceHistory implements Serializable {

    private final List<MaintenanceRecord> _recordList;


    /**
     *
     */
    public MaintenanceHistory() {
        _recordList = new ArrayList<MaintenanceRecord>();
    }


    /**
     * @param rec
     */
    public void add(MaintenanceRecord rec) {
        _recordList.add(rec);
    }


    /**
     * @return
     */
    @Override
    public String serialize() {
        StringBuilder sb = new StringBuilder();
        for (MaintenanceRecord rec : _recordList) {
            if (!sb.isEmpty())
                sb.append('|');

            sb.append(rec.serialize());
        }

        return sb.toString();
    }

    /**
     * @param s
     */
    @Override
    public void deserialize(String s) {
        String[] props = s.split("\\|");
        for (String prop : props) {
            MaintenanceRecord rec = new MaintenanceRecord();
            rec.deserialize(prop);
        }
    }
}
