package ly.generalassemb.drewmahrt.tictactoe;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    boolean chickenDinner;
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

        playerTurn.setText(playerOneName1);
    }


    public void checkWinner() {
        chickenDinner = false;
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("SharedKey", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if ((boxOne.getText().equals(":(") && boxTwo.getText().equals(":(") && boxThree.getText().equals(":(")) ||
                (boxFour.getText().equals(":(") && boxFive.getText().equals(":(") && boxSix.getText().equals(":(")) ||
                (boxSeven.getText().equals(":(") && boxEight.getText().equals(":(") && boxNine.getText().equals(":(")) ||
                (boxOne.getText().equals(":(") && boxFour.getText().equals(":(") && boxSeven.getText().equals(":(")) ||
                (boxTwo.getText().equals(":(") && boxFive.getText().equals(":(") && boxEight.getText().equals(":(")) ||
                (boxThree.getText().equals(":(") && boxSix.getText().equals(":(") && boxNine.getText().equals(":(")) ||
                (boxOne.getText().equals(":(") && boxFive.getText().equals(":(") && boxNine.getText().equals(":(")) ||
                (boxThree.getText().equals(":(") && boxFive.getText().equals(":(") && boxSeven.getText().equals(":("))) {
            chickenDinner = true;
            if (chickenDinner == true) {
                playerTurn.setText(playerOneName1+ " stands triumphant over " +playerTwoName2+"!");
                editor.putString("winnerWinner", playerOneName1);
                editor.commit();
                boxOne.setClickable(false); boxTwo.setClickable(false); boxThree.setClickable(false); boxFour.setClickable(false);
                boxFive.setClickable(false); boxSix.setClickable(false); boxSeven.setClickable(false); boxEight.setClickable(false);
                boxNine.setClickable(false);
            }
        } if ((boxOne.getText().equals(":)") && boxTwo.getText().equals(":)") && boxThree.getText().equals(":)")) ||
                (boxFour.getText().equals(":)") && boxFive.getText().equals(":)") && boxSix.getText().equals(":)")) ||
                (boxSeven.getText().equals(":)") && boxEight.getText().equals(":)") && boxNine.getText().equals(":)")) ||
                (boxOne.getText().equals(":)") && boxFour.getText().equals(":)") && boxSeven.getText().equals(":)")) ||
                (boxTwo.getText().equals(":)") && boxFive.getText().equals(":)") && boxEight.getText().equals(":)")) ||
                (boxThree.getText().equals(":)") && boxSix.getText().equals(":)") && boxNine.getText().equals(":)")) ||
                (boxOne.getText().equals(":)") && boxFive.getText().equals(":)") && boxNine.getText().equals(":)")) ||
                (boxThree.getText().equals(":)") && boxFive.getText().equals(":)") && boxSeven.getText().equals(":)"))) {
            chickenDinner = true;
            if (chickenDinner == true) {
                playerTurn.setText(playerTwoName2+ " has schooled " +playerOneName1+ " in a child's game!");
                editor.putString("winnerWinner", playerTwoName2);
                editor.commit();
                boxOne.setClickable(false); boxTwo.setClickable(false); boxThree.setClickable(false); boxFour.setClickable(false);
                boxFive.setClickable(false); boxSix.setClickable(false); boxSeven.setClickable(false); boxEight.setClickable(false);
                boxNine.setClickable(false);
            }
        } else if (counter >= 8) {
            Toast.makeText(GameActivity.this, "No winner, press back to restart", Toast.LENGTH_LONG).show();
        }
    }

    public void TV1(View view) {
        if (counter % 2 == 0) {
            boxOne.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxOne.setText(":)");
            playerTurn.setText(playerOneName1);
        }checkWinner();
        view.setClickable(false);
        counter++;
    }
    public void TV2(View view) {
        if (counter % 2 == 0) {
            boxTwo.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxTwo.setText(":)");
            playerTurn.setText(playerOneName1);
        }checkWinner();
        view.setClickable(false);
        counter++;
    }
    public void TV3(View view) {
        if (counter % 2 == 0) {
            boxThree.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxThree.setText(":)");
            playerTurn.setText(playerOneName1);
        }checkWinner();
        view.setClickable(false);
        counter++;
    }
    public void TV4(View view) {
        if (counter % 2 == 0) {
            boxFour.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxFour.setText(":)");
            playerTurn.setText(playerOneName1);
        }checkWinner();
        view.setClickable(false);
        counter++;
    }
    public void TV5(View view) {
        if (counter % 2 == 0) {
            boxFive.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxFive.setText(":)");
            playerTurn.setText(playerOneName1);
        }checkWinner();
        view.setClickable(false);
        counter++;
    }
    public void TV6(View view) {
        if (counter % 2 == 0) {
            boxSix.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxSix.setText(":)");
            playerTurn.setText(playerOneName1);
        }checkWinner();
        view.setClickable(false);
        counter++;
    }
    public void TV7(View view) {
        if (counter % 2 == 0) {
            boxSeven.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxSeven.setText(":)");
            playerTurn.setText(playerOneName1);
        }checkWinner();
        view.setClickable(false);
        counter++;
    }
    public void TV8(View view) {
        if (counter % 2 == 0) {
            boxEight.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxEight.setText(":)");
            playerTurn.setText(playerOneName1);
        }checkWinner();
        view.setClickable(false);
        counter++;
    }
    public void TV9(View view) {
        if (counter % 2 == 0) {
            boxNine.setText(":(");
            playerTurn.setText(playerTwoName2);
        } else if (counter % 2 == 1) {
            boxNine.setText(":)");
            playerTurn.setText(playerOneName1);
        }checkWinner();
        view.setClickable(false);
        counter++;
    }
}

