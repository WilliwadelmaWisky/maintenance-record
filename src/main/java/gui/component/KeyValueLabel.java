package gui.component;

import gui.util.Creator;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 * @version 11.11.2023
 */
public class KeyValueLabel extends HBox {

    private static final String FXML_PATH = "/fxml/keyvalue_label.fxml";

    @FXML Label _keyLabel;
    @FXML Label _valueLabel;


    /**
     *
     */
    public KeyValueLabel() {
        Creator.createFxml(FXML_PATH, this);

        _keyLabel.setMinWidth(200);
        _valueLabel.setPrefWidth(500);

        Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
        _keyLabel.setFont(font);
    }


    public String getKey() { return _keyLabel.getText(); }
    public String getValue() { return _valueLabel.getText(); }


    public void setKey(String key) { _keyLabel.setText(key); }
    public void setValue(String value) { _valueLabel.setText(value); }
}
