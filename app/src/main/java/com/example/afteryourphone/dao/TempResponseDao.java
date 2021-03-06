package com.example.afteryourphone.dao;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 18/2/2018 AD.
 */

public class TempResponseDao {
    @SerializedName("rain") String rain;
    @SerializedName("temp") double temp;
    @SerializedName("location") String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
