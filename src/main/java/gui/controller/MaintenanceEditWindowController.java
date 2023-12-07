package gui.controller;

import core.MaintenanceRecord;
import core.event.Callback;
import gui.component.KeyValueEntry;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * @version 1.0 - 2.12.2023
 * @version 1.1 - 7.12.2023
 */
public class MaintenanceEditWindowController {

    @FXML KeyValueEntry _dateEntry;
    @FXML KeyValueEntry _mileageEntry;
    @FXML KeyValueEntry _dealershipEntry;
    @FXML TextArea _descriptionField;

    private MaintenanceRecord _record;
    private Callback _onApply;
    private Callback _onCloseRequested;


    /**
     * @param record
     * @param onApply
     * @param onCloseRequested
     */
    public void onLoad(MaintenanceRecord record, Callback onApply, Callback onCloseRequested) {
        _record = record;
        _onApply = onApply;
        _onCloseRequested = onCloseRequested;

        _dateEntry.setValue(_record.getDate().toString());
        _mileageEntry.setValue(_record.getMileage().toString());
        _dealershipEntry.setValue(_record.getDealership().getName());
        _descriptionField.setText(_record.getDescription());
    }


    /**
     *
     */
    public void onApply() {
        if (_record == null)
            return;

        _record.setDescription(_descriptionField.getText());
        _record.getDate().deserialize(_dateEntry.getValue());
        _record.getDealership().setName(_dealershipEntry.getValue());

        _onApply.invoke();
        _onCloseRequested.invoke();
    }
}
