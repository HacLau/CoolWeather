package com.xwt.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liush on 2019/9/15.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
