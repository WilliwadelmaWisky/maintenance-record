package gui.controller;

import core.MaintenanceRecord;
import gui.component.KeyValueEntry;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

/**
 * @version 1.0 - 2.12.2023
 * @version 1.1 - 3.12.2023
 */
public class MaintenanceEditWindowController {

    @FXML KeyValueEntry _dateEntry;
    @FXML KeyValueEntry _mileageEntry;
    @FXML KeyValueEntry _dealershipEntry;
    @FXML TextArea _descriptionField;


    /**
     * @param record
     */
    public void onLoad(MaintenanceRecord record) {
        _dateEntry.setValue(record.getDate().toString());
        _mileageEntry.setValue(record.getMileage().toString());
        _dealershipEntry.setValue(record.getDealership().getName());
        _descriptionField.setText(record.getDescription());
    }
}
