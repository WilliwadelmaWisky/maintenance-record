package gui.util;

import javafx.fxml.FXMLLoader;
import java.io.IOException;

/**
 * @version 4.11.2023
 */
public final class Creator {

    /**
     * @param relativePath
     * @param root
     */
    public static void createFxml(String relativePath, Object root) {
        createFxml(relativePath, root, root);
    }

    /**
     * @param relativePath
     * @param root
     * @param controller
     */
    public static void createFxml(String relativePath, Object root, Object controller) {
        FXMLLoader loader = new FXMLLoader(Creator.class.getResource(relativePath));
        loader.setRoot(root);
        loader.setController(controller);

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
