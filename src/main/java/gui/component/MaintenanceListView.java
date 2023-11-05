package gui.component;

import gui.util.Creator;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

/**
 * @version 5.11.2023
 */
public class MaintenanceListView extends VBox {

    private static final String FXML_PATH = "/fxml/maintenance_listview.fxml";

    @FXML VBox _maintenanceList;


    /**
     *
     */
    public MaintenanceListView() {
        Creator.createFxml(FXML_PATH, this);

    }


    public void add(MaintenanceListCell cell) {
        _maintenanceList.getChildren().add(cell);
    }
}
