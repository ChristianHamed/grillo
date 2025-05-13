/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.grillo.entities;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import mx.itson.grillo.enums.WeatherStatus;

/**
 *
 * @author alumnog
 */
public class Weather {

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    private void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the temperature
     */
    private int getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the humidity
     */
    private int getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    private void setHumidity(int humidity) {
        this.humidity = humidity;
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
     * @return the windSpeed
     */
    private int getWindSpeed() {
        return windSpeed;
    }

    /**
     * @param windSpeed the windSpeed to set
     */
    private void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * @return the forecast
     */
    public List<Forecast> getForecast() {
        return forecast;
    }

    /**
     * @param forecast the forecast to set
     */
    private void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }
    
    private String city;
    private int temperature;
    private int humidity;
    private WeatherStatus status;
    @SerializedName("wind_speed")
    private int windSpeed;
    private List<Forecast> forecast;
    
    /**
     * 
     * @param json
     * @return 
     */
    public static Weather deserialize(String json) {
        Weather w = new Weather();
        try {
            Gson gson = new Gson();
            w = gson.fromJson(json, Weather.class);
        } catch (Exception ex) {
            System.err.println("Error:" + ex.getMessage());
        }
        return w;
    }
    
    
    
}
