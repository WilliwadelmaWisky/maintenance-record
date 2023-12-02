package gui.window;

import core.CarRecord;
import gui.controller.CarEditWindowController;
import gui.util.Loader;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * @version 2.12.2023
 */
public class CarEditWindow extends WindowBase {

    private static final String FXML_PATH = "/fxml/caredit_window.fxml";
    private static final String TITLE = "Edit";

    private CarEditWindowController _controller;


    /**
     * @param record
     */
    public CarEditWindow(CarRecord record) {
        super(new Stage());

        setTitle(TITLE);
        setResizable(false);

        _controller.onLoad(record);
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
