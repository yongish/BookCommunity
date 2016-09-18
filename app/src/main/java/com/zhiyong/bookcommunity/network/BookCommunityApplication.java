package com.zhiyong.bookcommunity.network;

import android.app.Application;

import com.parse.Parse;
import com.parse.interceptors.ParseLogInterceptor;
import com.zhiyong.bookcommunity.R;

/**
 * Created by zhiyong on 9/15/16.
 */
public class BookCommunityApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // set applicationId, and server server based on the values in the Heroku settings.
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getResources().getString(R.string.parse_app_id)) // should correspond to APP_ID env variable
                .addNetworkInterceptor(new ParseLogInterceptor())
                .server(getResources().getString(R.string.parse_url)).build());
    }
}
