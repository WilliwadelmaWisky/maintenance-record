package gui.component;

import core.MaintenanceRecord;
import gui.util.Creator;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;

/**
 * @version 1.0 - 4.11.2023
 * @version 1.1 - 5.11.2023
 */
public class MaintenanceListCell extends HBox {

    private static final String FXML_PATH = "/fxml/maintenance_listcell.fxml";

    @FXML Label _dateLabel;
    @FXML Label _mileageLabel;
    @FXML Label _dealershipLabel;


    /**
     *
     */
    public MaintenanceListCell() {
        Creator.createFxml(FXML_PATH, this);

        _dateLabel.setPrefWidth(150);
        _mileageLabel.setPrefWidth(100);
        _dealershipLabel.setPrefWidth(300);

        this.setOnMouseClicked(event -> {
            System.out.println("ServiceListCell.Clicked");
        });
    }


    public String getDate() { return _dateLabel.getText(); }
    public String getMileage() { return _mileageLabel.getText(); }
    public String getDealership() { return _dealershipLabel.getText(); }


    public void setDate(String date) { _dateLabel.setText(date); }
    public void setMileage(String milage) { _mileageLabel.setText(milage); }
    public void setDealership(String dealership) { _dealershipLabel.setText(dealership); }

    public void setBackgroundColor(String hex) {
        BackgroundFill backgroundFill = new BackgroundFill(Paint.valueOf(hex), CornerRadii.EMPTY, Insets.EMPTY);
        this.setBackground(new Background(backgroundFill));
    }


    /**
     * @param record
     * @return
     */
    public static MaintenanceListCell create(MaintenanceRecord record) {
        MaintenanceListCell cell = new MaintenanceListCell();
        cell.setDate(record.getDate().toString());
        cell.setMileage(record.getMileage().toString());
        cell.setDealership(record.getDealership().getName());
        return cell;
    }
}
