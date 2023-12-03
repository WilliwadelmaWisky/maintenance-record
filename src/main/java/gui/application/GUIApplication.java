package gui.application;

import core.*;
import core.util.Country;
import core.util.Date;
import core.util.FileUtil;
import javafx.application.Application;
import javafx.stage.Stage;
import gui.window.MainWindow;

/**
 * @version 1.0 - 29.10.2023
 * @version 1.1 - 3.12.2023
 */
public class GUIApplication extends Application {

    private static final String HOME_DIR = FileUtil.combinePath(FileUtil.USER_HOME, ".wwwisky", "maintenance_record");
    private static final String SEARCH_INFO_PATH = FileUtil.combinePath(HOME_DIR, "search_info.txt");


    /**
     *
     */
    public static void create() {
        System.out.println("Initialize home_dir");
        Application.launch(GUIApplication.class);
    }


    /**
     * @param stage
     */
    @Override
    public void start(Stage stage) {
        System.out.println("Retrieve search info");

        MainWindow window = new MainWindow(stage, this::load, this::save);
        window.show();
    }


    /**
     * @param record
     */
    public void save(CarRecord record) {
        if (record == null)
            return;

        System.out.println("Save: " + record.getVin());
    }

    /**
     * @param s
     * @return
     */
    public CarRecord load(String s) {
        CarModel model = new CarModel("Audi", "A6", Country.GERMANY, "2997", "lava grey", new Date(10, 12, 2003));
        Registration registration = new Registration(new Date(1, 1, 2004), "A¤A-999");
        CarRecord rec = new CarRecord("123456789", new Mileage(120000), model, registration);

        rec.getMaintenanceHistory().add(new MaintenanceRecord(new Mileage(80000), new Dealership("CarShop"), "Oil"));
        rec.getMaintenanceHistory().add(new MaintenanceRecord(new Mileage(95000), new Dealership("CarShop"), "Oil + Timing belt"));

        return rec;
    }
}
