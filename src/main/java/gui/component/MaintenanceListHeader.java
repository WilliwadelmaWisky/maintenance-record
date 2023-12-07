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
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 * @version 1.0 - 5.11.2023
 * @version 1.1 - 7.12.2023
 */
public class MaintenanceListHeader extends HBox {

    private static final String FXML_PATH = "/fxml/maintenance_listheader.fxml";

    @FXML Label _dateLabel;
    @FXML Label _mileageLabel;
    @FXML Label _dealershipLabel;
    @FXML Label _descriptionLabel;


    /**
     *
     */
    public MaintenanceListHeader() {
        Creator.createFxml(FXML_PATH, this);

        _dateLabel.setText("Date");
        _mileageLabel.setText("Mileage");
        _dealershipLabel.setText("Dealership");

        _dateLabel.setMinWidth(100);
        _mileageLabel.setMinWidth(100);
        _dealershipLabel.setMinWidth(120);
        _descriptionLabel.setPrefWidth(2000);

        String hex = "bacad4";
        BackgroundFill backgroundFill = new BackgroundFill(Paint.valueOf(hex), CornerRadii.EMPTY, Insets.EMPTY);
        this.setBackground(new Background(backgroundFill));

        Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
        _dateLabel.setFont(font);
        _mileageLabel.setFont(font);
        _dealershipLabel.setFont(font);
        _descriptionLabel.setFont(font);
    }
}
