package com.android.nutritious.nutritious;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

import com.android.nutritious.nutritious.JSONdata.Item;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

/**
 * Created by Ralu on 15.03.2015.
 */
public class SearchHandler extends AsyncTask<String, Void, ArrayList>{

    private final String LOG_TAG = SearchHandler.class.getSimpleName();

    private Context mContext;

    @Override
    protected ArrayList<Item> doInBackground(String... params) {
        ArrayList<Item> foodData = getFood(params);
        return foodData;
    }

    public void parseJSON(){
        RequestQueue queue = Volley.newRequestQueue(mContext);
        String query = "http://api.nal.usda.gov/usda/ndb/search/?format=json&q=butter&max=5&api_key=4AGGcqfK2u851bSOKRq1vHAHTHgG557VEt8yfYBw";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET,query, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject jsonObject) {
                JSONObject object = new Gson().fromJson(jsonObject.toString(), JSONObject.class);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                if (volleyError.networkResponse == null) {
                    Crouton.makeText(((Activity) mContext), mContext.getResources().getString(R.string.message_no_internet), Style.ALERT).show();
                }
                else {
                    Crouton.makeText(((Activity) mContext), mContext.getResources().getString(R.string.message_error), Style.ALERT).show();
                }
            }
        });
        //queue.add(stringRequest);
    }

    public ArrayList<Item> getFood(String... params) {

        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;

        String foodSearchJsonString = null;
        ArrayList<Item> foodData = new ArrayList<Item>();
        try {

            Uri.Builder urlBuilder = new Uri.Builder();
            // urlBuilder.scheme("http://api.nal.usda.gov/").appendPath("usda").appendPath("ndb").appendPath("search").appendQueryParameter("q", params[0]).appendQueryParameter("mode", "json")
            //       .appendQueryParameter("units", "metric").appendQueryParameter("cnt", "7");
            // URL url = new URL("http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7");
            URL url = new URL("http://api.nal.usda.gov/usda/ndb/search/?format=json&q=butter&max=20&api_key=4AGGcqfK2u851bSOKRq1vHAHTHgG557VEt8yfYBw");
            // URL url = new URL(urlBuilder.toString());
            Log.v(LOG_TAG, "Built URL: " + url.toString());

            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            // Read the input stream into a String
            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();
            if (inputStream == null) {
                foodData = null;
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                // Since it's JSON, adding a newline isn't necessary (it won't affect parsing)
                // But it does make debugging a *lot* easier if you print out the completed
                // buffer for debugging.
                buffer.append(line + "\n");
            }

            if (buffer.length() == 0) {
                // Stream was empty.  No point in parsing.
                foodData = null;
            }
            foodSearchJsonString = buffer.toString();

            Log.v(LOG_TAG, "Food JSON String: " + foodSearchJsonString);
            //foodData = getWeatherDataFromJson(foodSearchJsonString, 7);

        }
        catch (IOException e) {
            Log.e("SearchHandler", "Error ", e);
            // If the code didn't successfully get the data, there's no point in attempting
            // to parse it.
            foodData = null;
        }

        finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (final IOException e) {
                    Log.e("FoodParser", "Error closing stream", e);
                }
            }
        }

//        return foodData;
        return null;
    }
}
