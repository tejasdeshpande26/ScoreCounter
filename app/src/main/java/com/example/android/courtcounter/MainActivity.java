package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button twoPoints, threePoints, freeThrow;
    TextView scoreView;
    int totalScore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        twoPoints = findViewById(R.id.twoPoints);
        threePoints = findViewById(R.id.threePoints);
        freeThrow = findViewById(R.id.freeThrow);
        TextView scoreView = findViewById(R.id.team_a_score);

        twoPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScore = totalScore + 2;
                displayForTeamA(totalScore);
            }
        });

        threePoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScore = totalScore + 3;
                displayForTeamA(totalScore);
            }
        });

        freeThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScore = totalScore + 1;
                displayForTeamA(totalScore);
            }
        });
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        scoreView.setText(String.valueOf(score));
    }


}
