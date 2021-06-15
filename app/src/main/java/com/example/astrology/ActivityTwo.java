package com.example.astrology;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class ActivityTwo extends AppCompatActivity {
    //also when you make a new activity make sure it extends AppCompactActivity because otherwise
    //it isn't going to allow you to define it in the android manifest file and won't let you
    //link it to a display.

    private String callP1 = "https://sameer-kumar-aztro-v1.p.rapidapi.com/?sign=leo&day=tomorrow";
    private String callP2 = "&day=today";
    private Button button1;
    private Button button2;
    private Button button3;

    private Spinner sign;

    //we need this dependency in order to access the API
    //go to the graqdle file and add the following in the dependencies:"implementation 'com.loopj.android:android-async-http:1.4.9'"
    //you need to add this dependency in order to be able to import the class

    private static AsyncHttpClient client = new AsyncHttpClient();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //make sure that you set the content view to the correct xml
        setContentView(R.layout.activity_2);

        sign = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.zodiac_signs, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        sign.setAdapter(adapter);

        button1=findViewById(R.id.button_horoscope);

        //what happens when the button is clicked? We want to display something
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

    }

    public void getInfo(String p1, String p2, String p3){

        String fullURL=p1+p2+p3;
        //client header, when you access an API you will need to do this depending on what it requires
        //when you access an API it will tell you what headers you arre going to need.

        client.addHeader("accept", "application/json");
        client.addHeader("x-rapidapi-key", "8e0e965450mshabc60c604d4e10bp17a8bcjsna40496758a06");
        client.addHeader("x-rapidapi-host", "sameer-kumar-aztro-v1.p.rapidapi.com");

        client.get(fullURL, new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                try {
                    JSONObject json= new JSONObject((new String(responseBody)));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }
}
