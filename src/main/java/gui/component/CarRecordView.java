package gui.component;

import core.CarRecord;
import gui.util.Creator;
import javafx.fxml.FXML;
import javafx.scene.layout.HBox;

/**
 * @version 1.0 - 24.11.2023
 */
public class CarRecordView extends HBox {

    private static final String FXML_PATH = "/fxml/carrecord_view.fxml";

    @FXML KeyValueLabel _vinLabel;
    @FXML KeyValueLabel _makeLabel;
    @FXML KeyValueLabel _modelLabel;
    @FXML KeyValueLabel _colorLabel;
    @FXML KeyValueLabel _productionDateLabel;
    @FXML KeyValueLabel _registrationDateLabel;
    @FXML KeyValueLabel _mileageLabel;
    @FXML KeyValueLabel _registrationNumberLabel;



    /**
     *
     */
    public CarRecordView() {
        Creator.createFxml(FXML_PATH, this);
    }


    /**
     * @param record
     */
    public void show(CarRecord record) {
        _vinLabel.setValue(record.getVin());
        _makeLabel.setValue(record.getModel().getMake());
        _modelLabel.setValue(record.getModel().getModel());
        _colorLabel.setValue(record.getModel().getColorCode());
        _productionDateLabel.setValue(record.getModel().getProductionDate().toString());
        _registrationDateLabel.setValue(record.getRegistration().getFirstRegistrationDate().toString());
        _mileageLabel.setValue(record.getMileage().toString());
        _registrationNumberLabel.setValue(record.getRegistration().getRegistrationPlate());
    }
}
