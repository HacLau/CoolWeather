package com.xwt.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liush on 2019/9/15.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Sport {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }
}
