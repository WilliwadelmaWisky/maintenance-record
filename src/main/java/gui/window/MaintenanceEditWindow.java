package gui.window;

import core.MaintenanceRecord;
import core.event.Callback;
import gui.controller.MaintenanceEditWindowController;
import gui.util.Loader;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * @version 1.0 - 2.12.2023
 * @version 1.1 - 7.12.2023
 */
public class MaintenanceEditWindow extends WindowBase {

    private static final String FXML_PATH = "/fxml/maintenanceedit_window.fxml";
    private static final String TITLE = "Edit";

    private MaintenanceEditWindowController _controller;


    /**
     * @param record
     */
    public MaintenanceEditWindow(MaintenanceRecord record, Callback onApply) {
        super(new Stage());

        setTitle(TITLE);
        setResizable(false);

        _controller.onLoad(record, onApply, this::close);
    }


    /**
     * @return
     */
    @Override
    protected Parent loadContent() {
        return Loader.loadFxml(FXML_PATH, loader -> {
            _controller = loader.getController();
            return 0;
        });
    }
}
