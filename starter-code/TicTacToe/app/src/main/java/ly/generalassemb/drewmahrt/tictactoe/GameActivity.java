package ly.generalassemb.drewmahrt.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    double counter;
    TextView boxOne;
    TextView boxTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        boxOne = (TextView)findViewById(R.id.textView);
        boxTwo = (TextView)findViewById(R.id.textView2);

        double counter = Math.random() * 2;                                               // Sets random player as first player

        TextView playerTurn = (TextView) findViewById(R.id.game_message_text);

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
    }
}

