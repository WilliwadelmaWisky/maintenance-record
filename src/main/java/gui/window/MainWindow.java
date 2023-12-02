package gui.window;

import gui.util.Loader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import gui.controller.MainWindowController;

/**
 * @version 1.0 - 29.10.2023
 * @version 1.1 - 2.12.2023
 */
public class MainWindow extends WindowBase {

    private static final String FXML_PATH = "/fxml/main_window.fxml";
    private static final String TITLE = "Service manual";
    private static final int DEFAULT_WIDTH = 700;
    private static final int DEFAULT_HEIGHT = 500;

    private MainWindowController _controller;


    /**
     *
     */
    public MainWindow() {
        this(new Stage());
    }

    /**
     * @param stage
     */
    public MainWindow(Stage stage) {
        super(stage);

        setTitle(TITLE);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }


    /**
     * @return
     */
    @Override
    protected Parent loadContent() {
        return Loader.loadFxml(FXML_PATH);
    }

}
