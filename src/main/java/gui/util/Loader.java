package gui.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.util.Callback;
import java.io.IOException;

/**
 * @version 4.11.2023
 */
public final class Loader {

    /**
     * @param relativePath
     * @param onLoad
     * @return
     */
    public static Parent loadFxml(String relativePath, Callback<FXMLLoader, Integer> onLoad) {
        FXMLLoader loader = new FXMLLoader(Loader.class.getResource(relativePath));

        try {
            Parent root = loader.load();
            onLoad.call(loader);
            return root;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * @param relativePath
     * @return
     */
    public static Parent loadFxml(String relativePath) {
        return loadFxml(relativePath, loader -> 0);
    }


    /**
     * @param relativePath
     * @return
     */
    public static Image loadImage(String relativePath) {
        return new Image(Loader.class.getResourceAsStream(relativePath));
    }
}
