/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.grillo.entities;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import mx.itson.grillo.enums.WeatherStatus;

/**
 *
 * @author alumnog
 */
public class Forecast {

    /**
     * @return the day
     */
    public Date getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    private void setDay(Date day) {
        this.day = day;
    }

    /**
     * @return the status
     */
    private WeatherStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    private void setStatus(WeatherStatus status) {
        this.status = status;
    }

    /**
     * @return the maxTemperature
     */
    public int getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * @param maxTemperature the maxTemperature to set
     */
    private void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    /**
     * @return the minTemperature
     */
    public int getMinTemperature() {
        return minTemperature;
    }

    /**
     * @param minTemperature the minTemperature to set
     */
    private void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }
    
  
    public Object getMaxtTemperature() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private Date day;
    private WeatherStatus status;
    @SerializedName("max_temperature")
    private int maxTemperature;
    @SerializedName("min_temperature")
    private int minTemperature;
    
    public static double convertFarenheit(int temp) {
        
    return (temp * 1.8) + 32; }
            
}
