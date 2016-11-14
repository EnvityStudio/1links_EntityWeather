
package Entiy;

import java.util.HashMap;
import java.util.Map;
public class Main {
    private double temp;
    private double pressure;
    private int humidity;
    private double tempMin;
    private double tempMax;
    private double seaLevel;
    private double grndLevel;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Main() {
    }

    /**
     * 
     * @param seaLevel
     * @param humidity
     * @param pressure
     * @param grndLevel
     * @param tempMax
     * @param temp
     * @param tempMin
     */
    public Main(double temp, double pressure, int humidity, double tempMin, double tempMax, double seaLevel, double grndLevel) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.seaLevel = seaLevel;
        this.grndLevel = grndLevel;
    }

    /**
     * 
     * @return
     *     The temp
     */
    public double getTemp() {
        return temp;
    }

    /**
     * 
     * @param temp
     *     The temp
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }

    /**
     * 
     * @return
     *     The pressure
     */
    public double getPressure() {
        return pressure;
    }

    /**
     * 
     * @param pressure
     *     The pressure
     */
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    /**
     * 
     * @return
     *     The humidity
     */
    public int getHumidity() {
        return humidity;
    }

    /**
     * 
     * @param humidity
     *     The humidity
     */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    /**
     * 
     * @return
     *     The tempMin
     */
    public double getTempMin() {
        return tempMin;
    }

    /**
     * 
     * @param tempMin
     *     The temp_min
     */
    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    /**
     * 
     * @return
     *     The tempMax
     */
    public double getTempMax() {
        return tempMax;
    }

    /**
     * 
     * @param tempMax
     *     The temp_max
     */
    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    /**
     * 
     * @return
     *     The seaLevel
     */
    public double getSeaLevel() {
        return seaLevel;
    }

    /**
     * 
     * @param seaLevel
     *     The sea_level
     */
    public void setSeaLevel(double seaLevel) {
        this.seaLevel = seaLevel;
    }

    /**
     * 
     * @return
     *     The grndLevel
     */
    public double getGrndLevel() {
        return grndLevel;
    }

    /**
     * 
     * @param grndLevel
     *     The grnd_level
     */
    public void setGrndLevel(double grndLevel) {
        this.grndLevel = grndLevel;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
