package gui.controller;

import core.MaintenanceRecord;
import gui.component.KeyValueEntry;
import javafx.fxml.FXML;

/**
 * @version 2.12.2023
 */
public class MaintenanceEditWindowController {

    @FXML KeyValueEntry _dateEntry;
    @FXML KeyValueEntry _mileageEntry;
    @FXML KeyValueEntry _dealershipEntry;


    /**
     * @param record
     */
    public void onLoad(MaintenanceRecord record) {
        _dateEntry.setValue(record.getDate().toString());
        _mileageEntry.setValue(record.getMileage().toString());
        _dealershipEntry.setValue(record.getDealership().getName());
    }
}
