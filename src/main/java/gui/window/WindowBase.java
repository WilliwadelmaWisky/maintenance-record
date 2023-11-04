package gui.window;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @version 29.10.2023
 */
public abstract class WindowBase {

    private final Stage _stage;


    /**
     * @param stage
     */
    protected WindowBase(Stage stage) {
        _stage = stage;

        Parent root = loadContent();
        Scene scene = new Scene(root);

        _stage.setScene(scene);
    }


    /**
     * @param title
     */
    public void setTitle(String title) { _stage.setTitle(title); }

    /**
     * @param width
     * @param height
     */
    public void setSize(double width, double height) {
        _stage.setWidth(width);
        _stage.setHeight(height);
    }


    /**
     *
     */
    public void show() { _stage.show(); }

    /**
     *
     */
    public void close() { _stage.close(); }


    /**
     * @return
     */
    protected abstract Parent loadContent();
}
