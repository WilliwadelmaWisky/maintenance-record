package core;

import core.serialization.Serializable;
import core.util.Country;
import core.util.Date;

/**
 * @version 26.11.2023
 */
public class CarModel implements Serializable {

    private String _make;
    private String _model;
    private Country _country;
    private String _engineCode;
    private String _colorCode;
    private final Date _productionDate;


    /**
     * @param make
     * @param model
     * @param country
     * @param engineCode
     * @param colorCode
     * @param productionDate
     */
    public CarModel(String make, String model, Country country, String engineCode, String colorCode, Date productionDate) {
        _make = make;
        _model = model;
        _country = country;
        _engineCode = engineCode;
        _colorCode = colorCode;
        _productionDate = productionDate;
    }


    public String getMake() { return _make; }
    public String getModel() { return _model; }
    public Country getCountry() { return _country; }
    public String getColorCode() { return _colorCode; }
    public Date getProductionDate() { return _productionDate; }


    /**
     * @return
     */
    @Override
    public String serialize() {
        StringBuilder sb = new StringBuilder();
        sb.append(_make); sb.append(';');
        sb.append(_model); sb.append(';');
        sb.append(_country.name()); sb.append(';');
        sb.append(_productionDate.serialize()); sb.append(';');
        sb.append(_engineCode); sb.append(';');
        sb.append(_colorCode);
        return sb.toString();
    }

    /**
     * @param s
     */
    @Override
    public void deserialize(String s) {
        String[] props = s.split(";");
        _make = props[0].trim();
        _model = props[1].trim();
        _country = Country.valueOf(props[2].trim());
        _productionDate.deserialize(props[3].trim());
        _engineCode = props[4].trim();
        _colorCode = props[5].trim();
    }
}
