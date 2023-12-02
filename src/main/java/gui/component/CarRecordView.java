package gui.component;

import core.CarRecord;
import gui.util.Creator;
import gui.window.CarEditWindow;
import javafx.fxml.FXML;
import javafx.scene.layout.HBox;

/**
 * @version 1.0 - 24.11.2023
 * @version 1.1 - 2.12.2023
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

    private CarRecord _record;


    /**
     *
     */
    public CarRecordView() {
        Creator.createFxml(FXML_PATH, this);
        _record = null;

        this.setOnMouseClicked(e -> {
            if (_record == null)
                return;

            System.out.println("View clicked");
            CarEditWindow window = new CarEditWindow(_record);
            window.show();
        });
    }


    /**
     * @param record
     */
    public void show(CarRecord record) {
        _record = record;

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
