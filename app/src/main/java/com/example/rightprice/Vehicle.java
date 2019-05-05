package com.example.rightprice;
public class Point{
    private:
        float longitude;
        float latitude;

    public Point(float longitude, float latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}

public abstract class Vehicle {
    private:
        //
        String vendor;
        String type;
        Point location;

}
