package gui.controller;

import gui.component.ServiceCell;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

/**
 * @version 29.10.2023
 */
public class MainWindowController {

    @FXML VBox serviceList;


    /**
     *
     */
    @FXML
    public void initialize() {

        ServiceCell cell = new ServiceCell();
        cell.setDate("4.11.2023");
        cell.setMileage("122.078 km");
        cell.setDealership("Random dealership GMB");

        serviceList.getChildren().add(cell);
    }
}
