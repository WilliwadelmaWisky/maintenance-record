package core;

import core.serialization.Serializable;

/**
 * @version 1.0 - 11.11.2023
 * @version 1.1 - 26.11.2023
 */
public class CarRecord implements Serializable {

    private String _vin;
    private final Mileage _mileage;
    private final CarModel _model;
    private final Registration _registration;
    private final MaintenanceHistory _maintenanceHistory;


    /**
     * @param vin
     * @param mileage
     * @param model
     * @param registration
     */
    public CarRecord(String vin, Mileage mileage, CarModel model, Registration registration) {
        _vin = vin;
        _mileage = mileage;
        _model = model;
        _registration = registration;
        _maintenanceHistory = new MaintenanceHistory();
    }


    public String getVin() { return _vin; }
    public Mileage getMileage() { return _mileage; }
    public CarModel getModel() { return _model; }
    public Registration getRegistration() { return _registration; }
    public MaintenanceHistory getMaintenanceHistory() { return _maintenanceHistory; }


    /**
     * @return
     */
    @Override
    public String serialize() {
        StringBuilder sb = new StringBuilder();
        sb.append(_vin); sb.append('\n');
        sb.append(_mileage.serialize()); sb.append('\n');
        sb.append(_model.serialize()); sb.append('\n');
        sb.append(_registration.serialize()); sb.append('\n');
        sb.append(_maintenanceHistory.serialize()); sb.append('\n');
        return sb.toString();
    }

    /**
     * @param s
     */
    @Override
    public void deserialize(String s) {
        String[] props = s.split("\n");
        _vin = props[0].trim();
        _mileage.deserialize(props[1].trim());
        _model.deserialize(props[2].trim());
        _registration.deserialize(props[3].trim());
        _maintenanceHistory.deserialize(props[4].trim());
    }
}
