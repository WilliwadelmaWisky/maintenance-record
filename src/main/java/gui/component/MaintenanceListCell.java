package gui.component;

import core.MaintenanceRecord;
import gui.util.Creator;
import gui.window.MaintenanceEditWindow;
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
 * @version 1.1 - 3.12.2023
 */
public class MaintenanceListCell extends HBox {

    private static final String FXML_PATH = "/fxml/maintenance_listcell.fxml";

    @FXML Label _dateLabel;
    @FXML Label _mileageLabel;
    @FXML Label _dealershipLabel;
    @FXML Label _descriptionLabel;

    private MaintenanceRecord _record;


    /**
     *
     */
    public MaintenanceListCell() {
        Creator.createFxml(FXML_PATH, this);

        _dateLabel.setMinWidth(150);
        _mileageLabel.setMinWidth(100);
        _dealershipLabel.setMinWidth(100);
        _descriptionLabel.setPrefWidth(2000);

        this.setOnMouseClicked(event -> {
            if (_record == null)
                return;

            System.out.println("ServiceListCell.Clicked");
            MaintenanceEditWindow window = new MaintenanceEditWindow(_record);
            window.show();
        });
    }


    public void setBackgroundColor(String hex) {
        BackgroundFill backgroundFill = new BackgroundFill(Paint.valueOf(hex), CornerRadii.EMPTY, Insets.EMPTY);
        this.setBackground(new Background(backgroundFill));
    }


    /**
     * @param record
     */
    public void show(MaintenanceRecord record) {
        _record = record;

        _dateLabel.setText(record.getDate().toString());
        _mileageLabel.setText(record.getMileage().toString());
        _dealershipLabel.setText(record.getDealership().getName());
        _descriptionLabel.setText(record.getDescription());
    }
}
