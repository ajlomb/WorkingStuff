package ly.generalassemb.drewmahrt.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    double counter;
    TextView playerTurn;
    TextView boxOne, boxTwo, boxThree, boxFour, boxFive, boxSix, boxSeven, boxEight, boxNine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        playerTurn = (TextView)findViewById(R.id.game_message_text);
        boxOne = (TextView)findViewById(R.id.textView);
        boxTwo = (TextView)findViewById(R.id.textView2);
        boxThree = (TextView)findViewById(R.id.textView3);
        boxFour = (TextView)findViewById(R.id.textView4);
        boxFive = (TextView)findViewById(R.id.textView5);
        boxSix = (TextView)findViewById(R.id.textView6);
        boxSeven = (TextView)findViewById(R.id.textView7);
        boxEight = (TextView)findViewById(R.id.textView8);
        boxNine = (TextView)findViewById(R.id.textView9);

        double counter = Math.random() * 2;                                               // Sets random player as first player

        if (counter % 2 == 0) {

        }
        if (counter % 2 == 1) {

        }
        counter++;
    }


    public void TV1(View view) {
        if (counter % 2 == 0) {
            boxOne.setText("x");
        } else if (counter % 2 == 1) {
            boxOne.setText("o");
        }
        counter++;
    }
    public void TV2(View view) {
        if (counter % 2 == 0) {
            boxTwo.setText("x");
        } else if (counter % 2 == 1) {
            boxTwo.setText("o");
        }
        counter++;
    }
    public void TV3(View view) {
        if (counter % 2 == 0) {
            boxThree.setText("x");
        } else if (counter % 2 == 1) {
            boxThree.setText("o");
        }
        counter++;
    }
    public void TV4(View view) {
        if (counter % 2 == 0) {
            boxFour.setText("x");
        } else if (counter % 2 == 1) {
            boxFour.setText("o");
        }
        counter++;
    }
    public void TV5(View view) {
        if (counter % 2 == 0) {
            boxFive.setText("x");
        } else if (counter % 2 == 1) {
            boxFive.setText("o");
        }
        counter++;
    }
    public void TV6(View view) {
        if (counter % 2 == 0) {
            boxSix.setText("x");
        } else if (counter % 2 == 1) {
            boxSix.setText("o");
        }
        counter++;
    }
    public void TV7(View view) {
        if (counter % 2 == 0) {
            boxSeven.setText("x");
        } else if (counter % 2 == 1) {
            boxSeven.setText("o");
        }counter++;
    }
    public void TV8(View view) {
        if (counter % 2 == 0) {
            boxEight.setText("x");
        } else if (counter % 2 == 1) {
            boxEight.setText("o");
        }counter++;
    }
    public void TV9(View view) {
        if (counter % 2 == 0) {
            boxNine.setText("x");
        } else if (counter % 2 == 1) {
            boxNine.setText("o");
        }counter++;
    }
}

