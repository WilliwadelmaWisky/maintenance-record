package gui.window;

import core.event.SaveCallback;
import core.event.SearchCallback;
import core.util.event.Action;
import gui.util.Loader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import gui.controller.MainWindowController;

/**
 *
 */
public class MainWindow extends WindowBase {

    private static final String FXML_PATH = "/fxml/main_window.fxml";
    private static final String TITLE = "Service manual";
    private static final int DEFAULT_WIDTH = 700;
    private static final int DEFAULT_HEIGHT = 500;

    private MainWindowController _controller;


    /**
     * @param stage
     */
    public MainWindow(Stage stage) {
        super(stage);

        setTitle(TITLE);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        _controller.onLoad(null, null);
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
