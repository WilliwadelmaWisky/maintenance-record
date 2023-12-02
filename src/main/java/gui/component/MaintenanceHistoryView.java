package gui.component;

import core.MaintenanceHistory;
import core.MaintenanceRecord;
import gui.util.Creator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 * @version 1.0 - 24.11.2023
 * @version 1.1 - 2.12.2023
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
            MaintenanceListCell cell = new MaintenanceListCell();
            _maintenanceListView.add(cell);
            cell.show(rec);
        }
    }


    /**
     *
     */
    private void onAddRecord() {
        MaintenanceRecord record = new MaintenanceRecord();
        MaintenanceListCell cell = new MaintenanceListCell();
        _maintenanceListView.add(cell);
        cell.show(record);
    }

    /**
     *
     */
    private void onDeleteRecord() {
        _maintenanceListView.deleteLast();
    }
}
