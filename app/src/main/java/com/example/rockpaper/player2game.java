package com.example.rockpaper;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

public class player2game extends AppCompatActivity {


    String player1_choice = player1_choice_activity.player1choice_string;
    String player2_choice = player2_choice_activity.player2choice_string;

    String player1name = MainActivity.player1name;
    String player2name = MainActivity.player2name;

    int rounds = MainActivity.rounds;

    static int i = 1 ;

    static int  points1 = 0;
    static int points2 = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player2game_layout);

        TextView player1nametextview = (TextView) findViewById(R.id.player1_name);
        TextView player2nametextview = (TextView) findViewById(R.id.player2_name);
        final TextView score = (TextView) findViewById(R.id.score_textview);


        ImageView player1choiceimage = (ImageView) findViewById(R.id.player1_choice);
        ImageView player2choiceimage = (ImageView) findViewById(R.id.player2_choice);


        player1nametextview.setText(player1name);
        player2nametextview.setText(player2name);


        Log.v(player1name, "player1_choice");
        Log.v(player1_choice, "player1_choice");


        if (player1_choice.equals("rock")) {

            player1choiceimage.setImageResource(R.drawable.rock2);
        } else if (player1_choice.equals("paper")) {
            player1choiceimage.setImageResource(R.drawable.paper1);
        } else if (player1_choice.equals("scissors")) {
            player1choiceimage.setImageResource(R.drawable.scissors2);
        }


        if (player2_choice.equals("rock")) {

            player2choiceimage.setImageResource(R.drawable.rock2);
        } else if (player2_choice.equals("paper")) {
            player2choiceimage.setImageResource(R.drawable.paper1);
        } else if (player2_choice.equals("scissors")) {
            player2choiceimage.setImageResource(R.drawable.scissors2);
        }


        if (player1_choice.equals(player2_choice)) {
            score.setText(points1 + " - " + points2 + "\n Round " +i );
        } else if (player1_choice.equals("rock") && player2_choice.equals("scissors")) {
            points1++;
            score.setText(points1 + " - " + points2 + "\n Round " +i );
        } else if (player1_choice.equals("paper") && player2_choice.equals("rock")) {
            points1++;
            score.setText(points1 + " - " + points2 + "\n Round " +i );
        } else if (player1_choice.equals("scissors") && player2_choice.equals("paper")) {
            points1++;
            score.setText(points1 + " - " + points2 + "\n Round " +i );
        } else if (player1_choice.equals("scissors") && player2_choice.equals("rock")) {
            points2++;
            score.setText(points1 + " - " + points2 + "\n Round " +i );
        } else if (player1_choice.equals("rock") && player2_choice.equals("paper")) {
            points2++;
            score.setText(points1 + " - " + points2 + "\n Round " +i );
        } else if (player1_choice.equals("paper") && player2_choice.equals("scissors")) {
            points2++;
            score.setText(points1 + " - " + points2 + "\n Round " +i );
        }





            if(i<rounds) {



                new CountDownTimer(2500, 1000) {
                    public void onTick(long millisUntilFinished) {

                    }

                    public void onFinish() {

                        Intent colorsIntent = new Intent(player2game.this, player1_choice_activity.class);

                        // Start the new activity
                        startActivity(colorsIntent);
                    }
                }.start();

            }
        if(i == rounds) {
            if (points1 > points2)
                score.setText(points1 + " - " + points2 + "\n The winner is " + player1name);
            else if (points2 == points1)
                score.setText(points1 + " - " + points2 + "\n It's a Draw");
            else
                score.setText(points1 + " - " + points2 + "\n The winner is " + player2name);

            i=0;
            points2=0;
            points1=0;

        }
        i++;


//        if(i == rounds + 1) {
//            if(points1>points2)
//                score.setText(points1 + " - " + points2 + "\n The winner is " + player1name );
//            else if(points2 == points1)
//                score.setText(points1 + " - " + points2 + "\n It's a Draw");
//            else
//                score.setText(points1 + " - " + points2 + "\n The winner is " + player2name );







    }

    @Override
    public void onBackPressed(){
        NavUtils.navigateUpFromSameTask(this);

        i = 1;
        points2 = 0;
        points1 = 0;
    }
}
