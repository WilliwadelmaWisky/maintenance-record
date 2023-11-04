package gui.component;

import gui.util.Creator;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 * @version 4.11.2023
 */
public class ServiceCell extends HBox {

    private static final String FXML_PATH = "/fxml/service_cell.fxml";

    @FXML Label _dateLabel;
    @FXML Label _mileageLabel;
    @FXML Label _dealershipLabel;


    public ServiceCell() {
        Creator.createFxml(FXML_PATH, this);

        _dateLabel.setPrefWidth(150);
        _mileageLabel.setPrefWidth(100);
        _dealershipLabel.setPrefWidth(300);

        this.setOnMouseClicked(event -> {
            System.out.println("ServiceCell.Clicked");
        });
    }


    public String getDate() { return _dateLabel.getText(); }
    public String getMileage() { return _mileageLabel.getText(); }
    public String getDealership() { return _dealershipLabel.getText(); }


    public void setDate(String date) { _dateLabel.setText(date); }
    public void setMileage(String milage) { _mileageLabel.setText(milage); }
    public void setDealership(String dealership) { _dealershipLabel.setText(dealership); }
}
