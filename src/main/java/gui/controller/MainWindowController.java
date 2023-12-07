package gui.controller;

import core.CarRecord;
import core.DistanceUnit;
import core.event.SaveCallback;
import core.event.SearchCallback;
import core.util.EnumUtil;
import gui.component.CarRecordView;
import gui.component.MaintenanceHistoryView;
import gui.component.Menu;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 * @version 1.0 - 29.10.2023
 * @version 1.1 - 7.12.2023
 */
public class MainWindowController {

    @FXML MaintenanceHistoryView _maintenanceHistoryView;
    @FXML CarRecordView _carRecordView;
    @FXML ChoiceBox<String> _mileageChoiceBox;
    @FXML TextField _searchField;
    @FXML Menu _menu;

    private SearchCallback _onSearch;
    private SaveCallback _onSave;
    private CarRecord _record;


    /**
     *
     */
    public void onLoad(SearchCallback onSearch, SaveCallback onSave) {
        _onSearch = onSearch;
        _onSave = onSave;

        ObservableList<String> mileageOptionList = FXCollections.observableArrayList();
        mileageOptionList.addAll(EnumUtil.getNames(DistanceUnit.class));
        _mileageChoiceBox.setItems(mileageOptionList);
        _mileageChoiceBox.getSelectionModel().selectFirst();

        _menu.setSaveCallback(this::onSave);
    }


    /**
     *
     */
    @FXML
    private void onSearch() {
        if (_searchField.getText().isEmpty())
            return;

        System.out.println("Search...");
        CarRecord record = _onSearch.invoke(_searchField.getText());
        if (record == null)
            return;

        _record = record;
        _carRecordView.show(record);
        _maintenanceHistoryView.show(record.getMaintenanceHistory());
    }


    /**
     *
     */
    private void onSave() {
        _onSave.invoke(_record);
    }
}
