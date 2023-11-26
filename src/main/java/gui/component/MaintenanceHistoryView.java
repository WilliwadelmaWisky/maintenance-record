package gui.component;

import core.MaintenanceHistory;
import core.MaintenanceRecord;
import gui.util.Creator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 * @version 24.11.2023
 */
public class MaintenanceHistoryView extends VBox {

    private static final String FXML_PATH = "/fxml/maintenance_historyview.fxml";

    @FXML Button _addButton;
    @FXML Button _deleteButton;
    @FXML MaintenanceListView _maintenanceListView;


    /**
     *
     */
    public MaintenanceHistoryView() {
        Creator.createFxml(FXML_PATH, this);

        _addButton.setOnAction(e -> onAddRecord());
        _deleteButton.setOnAction(e -> onDeleteRecord());
    }


    /**
     * @param history
     */
    public void show(MaintenanceHistory history) {
        _maintenanceListView.clear();
        for (MaintenanceRecord rec : history) {
            MaintenanceListCell cell = MaintenanceListCell.create(rec);
            _maintenanceListView.add(cell);
        }
    }


    /**
     *
     */
    private void onAddRecord() {
        MaintenanceRecord record = new MaintenanceRecord();
        MaintenanceListCell cell = MaintenanceListCell.create(record);
        _maintenanceListView.add(cell);
    }

    /**
     *
     */
    private void onDeleteRecord() {
        _maintenanceListView.deleteLast();
    }
}
