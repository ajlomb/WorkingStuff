package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String winnerWinner;
    TextView winner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startPlaying(View view) {
        //capture edittext fields
        EditText playerOne = (EditText)findViewById(R.id.player_one_name);
        EditText playerTwo = (EditText)findViewById(R.id.player_two_name);

        //prevents play while either name field is blank when button is clicked
        if(playerOne.getText().toString().isEmpty() || playerTwo.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this, "Who is playing!?", Toast.LENGTH_LONG).show();
        }else {
            //turn on shared preferences
            SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("SharedKey", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            //capture edit text field entry and save it to shared pref.
            editor.putString("playerOneName", playerOne.getText().toString());
            editor.putString("playerTwoName", playerTwo.getText().toString());

            editor.commit();
            //intent to move to next activity
            Intent startGame = new Intent(MainActivity.this, GameActivity.class);
            startActivity(startGame);
        }
    }
    //brings back winner of previous games on resume
    public void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("SharedKey", MODE_PRIVATE);
        sharedPreferences.getString("winnerWinner", "");

        winner = (TextView) findViewById(R.id.last_winner_text);

        winnerWinner = String.valueOf(sharedPreferences.getString("winnerWinner", ""));
        //adds different text depending on if games have been played previously or not; #aesthetics.
        if (sharedPreferences.getString("winnerWinner", "").toString().isEmpty()) {
            winner.setText("Welcome to Happy-face Sad-face!");
        } else {
            winner.setText("Previous game winner was " + winnerWinner + "!!!");
        }
    }

}