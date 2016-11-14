
package Entiy;

import java.util.HashMap;
import java.util.Map;


public class Rain {

    private double _3h;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Rain() {
    }

    /**
     * 
     * @param _3h
     */
    public Rain(double _3h) {
        this._3h = _3h;
    }

    /**
     * 
     * @return
     *     The _3h
     */
    public double get3h() {
        return _3h;
    }

    /**
     * 
     * @param _3h
     *     The 3h
     */
    public void set3h(double _3h) {
        this._3h = _3h;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
