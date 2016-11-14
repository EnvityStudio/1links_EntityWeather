package vn.onelinks.envityweather;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.location.Location;
import android.os.AsyncTask;
import android.util.Log;

import com.google.android.gms.appdatasearch.GetRecentContextCall;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Thuan Nguyen on 11/14/2016.
 */

public class AsyncTaskWeather extends AsyncTask {


    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }

    public  interface  Callback{
        void onFinish(String body);
    }
    private  Callback callback;
    public  void setCallback(Callback callback){
        this.callback =callback;
    }
    private static final String TAG = "WeatherAsyncTask";
    private ProgressDialog mProgressDialog;
    private Location location;

    public AsyncTaskWeather(Context context) {
        mProgressDialog = new ProgressDialog(context);
        mProgressDialog.setMessage("Loading");
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgressDialog.setCancelable(false);
        mProgressDialog.show();
    }

    public AsyncTaskWeather(Context context, Location location) {
        this.location = location;
        mProgressDialog = new ProgressDialog(context);
        mProgressDialog.setMessage("Loading");
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgressDialog.setCancelable(false);
        mProgressDialog.show();
    }
    protected String doInBackground(Void... voids) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://api.openweathermap.org/data/2.5/weather?lat=" + location.getLatitude()
                        + "&lon=" + location.getLongitude()+ "&APPID=ee190d1b9efca7a04c6a345ce744edc5")
                .addHeader("Accept", "application/json")
                .build();

        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                String body = response.body().string();
                Log.d(TAG, "body = " + body);

                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    protected void onPostExecute(String body) {
        super.onPostExecute(body);
        mProgressDialog.dismiss();
        if(callback != null){
            callback.onFinish(body);
        }
    }
}

