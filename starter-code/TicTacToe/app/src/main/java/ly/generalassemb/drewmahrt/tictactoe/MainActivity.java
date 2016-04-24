package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    String playerOne;
//    String playerTwo;
//    ArrayList<String> players;
//    ArrayAdapter<String> mPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startPlaying(View view) {

        EditText playerOne = (EditText)findViewById(R.id.player_one_name);
        EditText playerTwo = (EditText)findViewById(R.id.player_two_name);


        if(playerOne.toString().isEmpty() || playerTwo.toString().isEmpty()){
            Toast.makeText(MainActivity.this, "Who is playing!?", Toast.LENGTH_LONG).show();
            return;
        }else {

            SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("SharedKey", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();

            editor.putString("playerOneName", playerOne.getText().toString());
            editor.putString("playerTwoName", playerTwo.getText().toString());

            editor.commit();

            Intent startGame = new Intent(MainActivity.this, GameActivity.class);
            startActivity(startGame);
        }
    }
}