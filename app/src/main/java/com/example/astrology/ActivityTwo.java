package com.example.astrology;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //we are going to add in text boxes to ask for the day you want,
        //get your horoscope




    }

}

/**
 *
 *
 client.addHeader("accept", "application/json");
 client.get(api_urlC, new AsyncHttpResponseHandler(){
@Override
public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
try{
JSONObject json= new JSONObject((new String(responseBody)));
SharedPreferences.Editor editor =sharedPreferences.edit();
editor.putString("name", json.getString("name"));
editor.putString("status", json.getString("status"));
editor.putString("species", json.getString("species"));
editor.putString("type",json.getString("type"));
editor.putString("gender", json.getString("gender"));
editor.putString("origin", json.getJSONObject("origin").getString("name"));
editor.putString("location",json.getJSONObject("location").getString("name"));
editor.putString("imageURL", json.getString("image"));

JSONArray array= json.getJSONArray("episode");
ArrayList <String> ep = filterEpisodes(array);
String episodes=ep.toString();
editor.putString("episodes", episodes);
editor.apply(); //DONT FORGET TO APPLY !!!

}
catch (JSONException e) {
e.printStackTrace();
} **/