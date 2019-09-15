package com.xwt.coolweather.gson;

/**
 * Created by liush on 2019/9/15.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
