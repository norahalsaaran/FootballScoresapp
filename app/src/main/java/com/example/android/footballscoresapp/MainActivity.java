package com.example.android.footballscoresapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int team1_score = 0 ;
    int team1_faul = 0 ;
    int team2_score = 0 ;
    int team2_faul = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    //---------team 1 function --------------------------------
    public void team1_decrement_score (View view)
    {
        if (team1_score > 0 ) {
            team1_score = team1_score - 1;
            team1_display_score(team1_score);
        }
    }
    public void team1_increment_score (View view)
    {

        team1_score = team1_score + 1 ;
        team1_display_score(team1_score);
    }
    public void team1_reset_score (View view)
    {

        team1_score = 0 ;
        team1_display_score(team1_score);
    }
    private void team1_display_score(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team1_score);
        quantityTextView.setText("" + number);
    }
    public void team1_decrement_faul (View view)
    {
        if (team1_faul > 0 ) {
            team1_faul = team1_faul - 1;
            team1_display_faul(team1_faul);
        }
    }
    public void team1_increment_faul (View view)
    {
        team1_faul = team1_faul + 1 ;
        team1_display_faul(team1_faul);
    }
    public void team1_reset_faul (View view)
    {
        team1_faul = 0 ;
        team1_display_faul(team1_faul);
    }
    private void team1_display_faul(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team1_faul);
        quantityTextView.setText("" + number);
    }
    //----------------------------------------------------------

    //---------team 2 function --------------------------------
    public void team2_decrement_score (View view)
    {
        if (team2_score > 0 ) {
            team2_score = team2_score - 1;
            team2_display_score(team2_score);
        }
    }
    public void team2_increment_score (View view)
    {
        team2_score = team2_score + 1 ;
        team2_display_score(team2_score);
    }
    public void team2_reset_score (View view)
    {
        team2_score = 0 ;
        team2_display_score(team2_score);
    }
    private void team2_display_score(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team2_score);
        quantityTextView.setText("" + number);
    }
    public void team2_decrement_faul (View view)
    {
        if (team2_faul > 0) {
            team2_faul = team2_faul - 1;
            team2_display_faul(team2_faul);
        }
    }
    public void team2_increment_faul (View view)
    {
        team2_faul = team2_faul + 1 ;
        team2_display_faul(team2_faul);
    }
    public void team2_reset_faul (View view)
    {
        team2_faul = 0 ;
        team2_display_faul(team2_faul);
    }
    private void team2_display_faul(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team2_faul);
        quantityTextView.setText("" + number);
    }
    //----------------------------------------------------------



}
