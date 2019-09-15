package com.xwt.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liush on 2019/9/15.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
