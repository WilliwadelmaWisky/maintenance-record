package gui.component;

import gui.util.Creator;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * @version 2.12.2023
 */
public class KeyValueEntry extends HBox {

    private static final String FXML_PATH = "/fxml/keyvalue_entry.fxml";

    @FXML Label _keyLabel;
    @FXML TextField _valueField;


    /**
     *
     */
    public KeyValueEntry() {
        Creator.createFxml(FXML_PATH, this);

        _keyLabel.setMinWidth(200);
        _valueField.setPrefWidth(500);
    }


    public String getKey() { return _keyLabel.getText(); }
    public String getValue() { return _valueField.getText(); }
    public boolean getDisable() { return this.isDisable(); }


    public void setKey(String key) { _keyLabel.setText(key); }
    public void setValue(String value) { _valueField.setText(value); }
    public void disable(boolean disable) { this.setDisable(disable); }
}
