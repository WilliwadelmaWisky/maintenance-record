package gui.controller;

import core.CarRecord;
import gui.component.KeyValueEntry;
import javafx.fxml.FXML;

/**
 * @version 2.12.2023
 */
public class CarEditWindowController {

    @FXML KeyValueEntry _vinEntry;
    @FXML KeyValueEntry _makeEntry;
    @FXML KeyValueEntry _modelEntry;
    @FXML KeyValueEntry _colorEntry;
    @FXML KeyValueEntry _productionDateEntry;
    @FXML KeyValueEntry _mileageEntry;
    @FXML KeyValueEntry _registrationDateEntry;
    @FXML KeyValueEntry _registrationNumberEntry;


    /**
     * @param record
     */
    public void onLoad(CarRecord record) {
        _vinEntry.setValue(record.getVin());
        _makeEntry.setValue(record.getModel().getMake());
        _modelEntry.setValue(record.getModel().getModel());
        _colorEntry.setValue(record.getModel().getColorCode());
        _productionDateEntry.setValue(record.getModel().getProductionDate().toString());
        _mileageEntry.setValue(record.getMileage().toString());
        _registrationDateEntry.setValue(record.getRegistration().getFirstRegistrationDate().toString());
        _registrationNumberEntry.setValue(record.getRegistration().getRegistrationPlate());
    }
}
