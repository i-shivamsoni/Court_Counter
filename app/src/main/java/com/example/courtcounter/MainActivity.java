package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scoreboard_a = 0;
    int scoreboard_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pointers3a(View view) {
        scoreboard_a = scoreboard_a + 3;
        TextView tx = (TextView) findViewById(R.id.tvsba);
        tx.setText("" + scoreboard_a);
    }

    public void pointers2a(View view) {
        scoreboard_a = scoreboard_a + 2;
        TextView tx = (TextView) findViewById(R.id.tvsba);
        tx.setText("" + scoreboard_a);
    }

    public void freethrowa(View view) {
        scoreboard_a = scoreboard_a + 1;
        TextView tx = (TextView) findViewById(R.id.tvsba);
        tx.setText("" + scoreboard_a);
    }

    public void pointers3b(View view) {
        scoreboard_b = scoreboard_b + 3;
        TextView tx = (TextView) findViewById(R.id.scoreboardB);
        tx.setText("" + scoreboard_b);
    }

    public void pointers2b(View view) {
        scoreboard_b = scoreboard_b + 2;
        TextView tx = (TextView) findViewById(R.id.scoreboardB);
        tx.setText("" + scoreboard_b);
    }

    public void freethrowb(View view) {
        scoreboard_b = scoreboard_b + 1;
        TextView tx = (TextView) findViewById(R.id.scoreboardB);
        tx.setText("" + scoreboard_b);
    }

    public void reset(View view) {
        scoreboard_a=0;
        scoreboard_b =0;

        TextView txa = (TextView) findViewById(R.id.tvsba);
        txa.setText("" + scoreboard_a);
        TextView txb = (TextView) findViewById(R.id.scoreboardB);
        txb.setText("" + scoreboard_b);

    }

}
