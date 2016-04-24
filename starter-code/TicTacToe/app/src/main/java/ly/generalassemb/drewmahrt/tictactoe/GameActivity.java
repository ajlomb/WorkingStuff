package ly.generalassemb.drewmahrt.tictactoe;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    double counter;
    String playerOneName1, playerTwoName2;
    TextView playerTurn;
    TextView boxOne, boxTwo, boxThree, boxFour, boxFive, boxSix, boxSeven, boxEight, boxNine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        playerTurn = (TextView) findViewById(R.id.game_message_text);
        boxOne = (TextView) findViewById(R.id.textView);
        boxTwo = (TextView) findViewById(R.id.textView2);
        boxThree = (TextView) findViewById(R.id.textView3);
        boxFour = (TextView) findViewById(R.id.textView4);
        boxFive = (TextView) findViewById(R.id.textView5);
        boxSix = (TextView) findViewById(R.id.textView6);
        boxSeven = (TextView) findViewById(R.id.textView7);
        boxEight = (TextView) findViewById(R.id.textView8);
        boxNine = (TextView) findViewById(R.id.textView9);

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("SharedKey", MODE_PRIVATE);
        sharedPreferences.getString("playerOneName", "");
        sharedPreferences.getString("playerTwoName", "");

        playerOneName1 = String.valueOf(sharedPreferences.getString("playerOneName", ""));
        playerTwoName2 = String.valueOf(sharedPreferences.getString("playerTwoName", ""));

  //      counter = 2;


            if (counter % 2 == 0) {
                playerTurn.setText(playerOneName1);
            } else if (counter % 2 == 1) {
                playerTurn.setText(playerTwoName2);
            }


    }


    public void TV1(View view) {
        if (counter % 2 == 0) {
            boxOne.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxOne.setText(":)");
            playerTurn.setText(playerOneName1);
        }view.setClickable(false);
        counter++;
    }
    public void TV2(View view) {
        if (counter % 2 == 0) {
            boxTwo.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxTwo.setText(":)");
            playerTurn.setText(playerOneName1);
        }view.setClickable(false);
        counter++;
    }
    public void TV3(View view) {
        if (counter % 2 == 0) {
            boxThree.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxThree.setText(":)");
            playerTurn.setText(playerOneName1);
        }view.setClickable(false);
        counter++;
    }
    public void TV4(View view) {
        if (counter % 2 == 0) {
            boxFour.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxFour.setText(":)");
            playerTurn.setText(playerOneName1);
        }view.setClickable(false);
        counter++;
    }
    public void TV5(View view) {
        if (counter % 2 == 0) {
            boxFive.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxFive.setText(":)");
            playerTurn.setText(playerOneName1);
        }view.setClickable(false);
        counter++;
    }
    public void TV6(View view) {
        if (counter % 2 == 0) {
            boxSix.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxSix.setText(":)");
            playerTurn.setText(playerOneName1);
        }view.setClickable(false);
        counter++;
    }
    public void TV7(View view) {
        if (counter % 2 == 0) {
            boxSeven.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxSeven.setText(":)");
            playerTurn.setText(playerOneName1);
        }view.setClickable(false);
        counter++;
    }
    public void TV8(View view) {
        if (counter % 2 == 0) {
            boxEight.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxEight.setText(":)");
            playerTurn.setText(playerOneName1);
        }view.setClickable(false);
        counter++;
    }
    public void TV9(View view) {
        if (counter % 2 == 0) {
            boxNine.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxNine.setText(":)");
            playerTurn.setText(playerOneName1);
        }view.setClickable(false);
        counter++;
    }
}

