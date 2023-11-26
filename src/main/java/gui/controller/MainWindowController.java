package gui.controller;

import core.*;
import core.util.Country;
import core.util.Date;
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
 * @version 1.1 - 26.11.2023
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

        CarModel model = new CarModel("Audi", "A6", Country.GERMANY, "2997", "lava grey", new Date(10, 12, 2003));
        Registration registration = new Registration(new Date(1, 1, 2004), "A¤A-999");
        CarRecord rec = new CarRecord("123456789", new Mileage(120000), model, registration);
        _carRecordView.show(rec);

        rec.getMaintenanceHistory().add(new MaintenanceRecord(new Mileage(80000), new Dealership("CarShop")));
        rec.getMaintenanceHistory().add(new MaintenanceRecord(new Mileage(95000), new Dealership("CarShop")));
        _maintenanceHistoryView.show(rec.getMaintenanceHistory());
    }
}
