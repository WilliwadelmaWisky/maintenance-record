package gui.window;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import gui.controller.MainWindowController;

/**
 * @version 29.10.2023
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

        Parent root = null;
        try {
            root = FXMLLoader.load(MainWindow.class.getResource(FXML_PATH));

        } catch(Exception e){
            e.printStackTrace();
        }

        return root;
    }

}
