package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by husong on 2018/4/12.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        //public String updateTime;
        public String loc;
        public String utc;
    }

}
