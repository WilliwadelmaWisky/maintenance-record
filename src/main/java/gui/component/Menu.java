package gui.component;

import core.event.Callback;
import gui.util.Creator;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

/**
 *
 */
public class Menu extends MenuBar {

    private static final String FXML_PATH = "/fxml/menubar.fxml";

    @FXML MenuItem _saveButton;


    /**
     *
     */
    public Menu() {
        Creator.createFxml(FXML_PATH, this);
    }


    /**
     * @param saveCallback
     */
    public void setSaveCallback(Callback saveCallback) {
        _saveButton.setOnAction(e -> saveCallback.invoke());
    }
}
