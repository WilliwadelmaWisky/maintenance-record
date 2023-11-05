package gui.controller;

import core.DistanceUnit;
import core.MaintenanceRecord;
import gui.component.MaintenanceListCell;
import gui.component.MaintenanceListView;
import javafx.fxml.FXML;

/**
 * @version 1.0 - 29.10.2023
 * @version 1.1 - 5.11.2023
 */
public class MainWindowController {

    @FXML MaintenanceListView _maintenanceListView;


    /**
     *
     */
    @FXML
    public void initialize() {

        MaintenanceRecord rec = new MaintenanceRecord();

        MaintenanceListCell cell = new MaintenanceListCell();
        cell.setDate(rec.getDate().toString());
        cell.setMileage(rec.getMileage().toString());
        cell.setDealership(rec.getDealership());

        _maintenanceListView.add(cell);
    }
}
