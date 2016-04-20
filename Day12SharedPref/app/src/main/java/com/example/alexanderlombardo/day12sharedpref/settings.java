package com.example.alexanderlombardo.day12sharedpref;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    @Override
    protected void onPause() {
        super.onPause();                                                // ON PAUSE, DO BELOW!
    //  SET EDITTEXT VARIABLE (editTV1/2) TO VALUE CAPTURED FROM EDITTEXT FIELDS
        EditText editTV1 = (EditText)findViewById(R.id.textsize1);
        EditText editTV2 = (EditText)findViewById(R.id.textsize2);
    //  PREPARE SHAREDPREFERENCES TO STORE DATA
        SharedPreferences sharedPreference = getApplicationContext().getSharedPreferences("SharedKey", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreference.edit();
    //
        editor.putString("meaningfulName", editTV1.getText().toString());
        editor.putString("moreMeaningfulName", editTV2.getText().toString());

        editor.commit();
    }
}
