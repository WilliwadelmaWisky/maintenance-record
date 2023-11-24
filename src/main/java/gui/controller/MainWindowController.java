package gui.controller;

import core.DistanceUnit;
import core.util.EnumUtil;
import gui.component.CarRecordView;
import gui.component.MaintenanceHistoryView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 * @version 1.0 - 29.10.2023
 * @version 1.1 - 24.11.2023
 */
public class MainWindowController {

    @FXML MaintenanceHistoryView _maintenanceHistoryView;
    @FXML CarRecordView _carRecordView;
    @FXML ChoiceBox<String> _mileageChoiceBox;
    @FXML TextField _searchField;


    /**
     *
     */
    @FXML
    private void initialize() {
        ObservableList<String> mileageOptionList = FXCollections.observableArrayList();
        mileageOptionList.addAll(EnumUtil.getNames(DistanceUnit.class));
        _mileageChoiceBox.setItems(mileageOptionList);
        _mileageChoiceBox.getSelectionModel().selectFirst();
    }


    /**
     *
     */
    @FXML
    private void onSearch() {
        if (_searchField.getText().isEmpty())
            return;

        System.out.println("Search...");
    }
}
