package gui.component;

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
 * @version 5.11.2023
 */
public class MaintenanceListHeader extends HBox {

    private static final String FXML_PATH = "/fxml/maintenance_listcell.fxml";

    @FXML Label _dateLabel;
    @FXML Label _mileageLabel;
    @FXML Label _dealershipLabel;


    /**
     *
     */
    public MaintenanceListHeader() {
        Creator.createFxml(FXML_PATH, this);

        _dateLabel.setText("Maintenance date");
        _mileageLabel.setText("Mileage");
        _dealershipLabel.setText("Dealership");

        _dateLabel.setPrefWidth(150);
        _mileageLabel.setPrefWidth(100);
        _dealershipLabel.setPrefWidth(300);

        String hex = "FF0000";
        BackgroundFill backgroundFill = new BackgroundFill(Paint.valueOf(hex), CornerRadii.EMPTY, Insets.EMPTY);
        this.setBackground(new Background(backgroundFill));
    }
}
