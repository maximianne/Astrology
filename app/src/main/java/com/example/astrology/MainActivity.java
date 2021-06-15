package com.example.astrology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private Button act2;
  private Button act3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // test=findViewById(R.id.text_test);
        
        act2= findViewById(R.id.button_activity2);
        act3= findViewById(R.id.button_activty3);

        act2.setOnClickListener(v-> launchNextActivity1(v));
        act3.setOnClickListener(v-> launchNextActivity2(v));

    }


    public void launchNextActivity1(View view){
        Intent intent = new Intent (this, ActivityTwo.class);
        startActivity(intent);
    }
    public void launchNextActivity2(View view){
        Intent intent = new Intent (this, ActivityThree.class);
        startActivity(intent);
    }
}