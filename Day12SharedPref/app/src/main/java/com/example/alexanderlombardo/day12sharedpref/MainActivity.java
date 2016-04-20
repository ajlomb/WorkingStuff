package com.example.alexanderlombardo.day12sharedpref;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int textsize;
    int textsize2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("SharedKey", MODE_PRIVATE);
        sharedPreferences.getString("meaningfulName", "");

        TextView line1 = (TextView) findViewById(R.id.text1);
        TextView line2 = (TextView) findViewById(R.id.text2);

        textsize = Integer.parseInt(sharedPreferences.getString("meaningfulName", ""));
        textsize2 = Integer.parseInt(sharedPreferences.getString("moreMeaningfulName", ""));

        line1.setTextSize(TypedValue.COMPLEX_UNIT_SP, textsize);
        line2.setTextSize(TypedValue.COMPLEX_UNIT_SP, textsize2);

    }

    public void settings(View v){
        Intent mover = new Intent(MainActivity.this, settings.class);
        startActivity(mover);
    }


}
