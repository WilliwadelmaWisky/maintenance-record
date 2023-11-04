package gui.application;

import javafx.application.Application;
import javafx.stage.Stage;
import gui.window.MainWindow;

/**
 * @version 1.0 - 29.10.2023
 * @version 1.1 - 4.11.2023
 */
public class GUIApplication extends Application {

    /**
     *
     */
    public static void create() {
        Application.launch(GUIApplication.class);
    }

    /**
     * @param stage
     */
    @Override
    public void start(Stage stage) {
        MainWindow window = new MainWindow(stage);
        window.show();
    }
}
