package com.example.rockpaper;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class computergame_activity extends AppCompatActivity {

    ArrayList<String> choices = new ArrayList<>(3);


    int rounds = MainActivity.rounds;

    ImageView comp_image;
    ImageView player_image;


    String player1_choice;
    String comp_choice;

    int points_p;
    int points_c;

    int j;

    final boolean[] flag = {false};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.computergame_layout);

        TextView textView = (TextView) findViewById(R.id.comp_score);

        final View view = findViewById(R.id.parent) ;

        player1_choice = "";
        comp_choice = "";

        points_p = 0;
        points_c = 0;

        j = 1;

        flag[0] = false;


        choices.add(0, "rock");
        choices.add(1, "paper");
        choices.add(2, "scissors");


        ImageView player2_rock = (ImageView) findViewById(R.id.comp_player1_rock);
        player2_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (j <= rounds) {

                    comp_image = (ImageView) findViewById(R.id.comp_image);

                TextView textView = (TextView) findViewById(R.id.comp_score);


                flag[0] = true;

                player1_choice = "rock";

                player_image = (ImageView) findViewById(R.id.player_image);
                player_image.setImageResource(R.drawable.rock2);
                player_image.setBackgroundColor(0xff00ddff);

                computergame_activity obj = new computergame_activity();
                comp_choice = obj.getRandomElement_random_options(choices);

                if (comp_choice.equals("rock")) {
                    comp_image.setImageResource(R.drawable.rock2);
                    comp_image.setBackgroundColor(0xff00ddff);

                    textView.setText(points_p + " - " + points_c + "\n Round " + j);


                }

                if (comp_choice.equals("paper")) {
                    comp_image.setImageResource(R.drawable.paper1);
                    comp_image.setBackgroundColor(0xffff4444);

                    points_c++;
                    textView.setText(points_p + " - " + points_c + "\n Round " + j);


                }

                if (comp_choice.equals("scissors")) {
                    comp_image.setImageResource(R.drawable.scissors2);
                    comp_image.setBackgroundColor(0xff99cc00);

                    points_p++;
                    textView.setText(points_p + " - " + points_c + "\n Round " + j);


                }

                if(j == rounds){
                    if(points_p>points_c){
                        textView.setText(points_p + " - " + points_c + "\n YOU WON😀😀😀");
                        view.setBackgroundColor(Color.GREEN);
                    }
                    else if(points_p==points_c){
                        textView.setText(points_p + " - " + points_c + "\n It's a draw");
                    }
                    else {
                        textView.setText(points_p + " - " + points_c + "\n YOU LOST😭😭😭");
                        view.setBackgroundColor(Color.RED);

                    }
                }

                j++;

            }
            }
        });


        ImageView player2_paper = (ImageView) findViewById(R.id.comp_player1_paper);
        player2_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(j<=rounds) {

                    comp_image = (ImageView) findViewById(R.id.comp_image);

                    TextView textView = (TextView) findViewById(R.id.comp_score);

                    flag[0] = true;


                    player1_choice = "paper";

                    player_image = (ImageView) findViewById(R.id.player_image);
                    player_image.setImageResource(R.drawable.paper1);
                    player_image.setBackgroundColor(0xffff4444);

                    computergame_activity obj = new computergame_activity();
                    comp_choice = obj.getRandomElement_random_options(choices);

                    if (comp_choice.equals("rock")) {
                        comp_image.setImageResource(R.drawable.rock2);
                        comp_image.setBackgroundColor(0xff00ddff);

                        points_p++;
                        textView.setText(points_p + " - " + points_c + "\n Round " + j);


                    }

                    if (comp_choice.equals("paper")) {
                        comp_image.setImageResource(R.drawable.paper1);
                        comp_image.setBackgroundColor(0xffff4444);

                        textView.setText(points_p + " - " + points_c + "\n Round " + j);


                    }

                    if (comp_choice.equals("scissors")) {
                        comp_image.setImageResource(R.drawable.scissors2);
                        comp_image.setBackgroundColor(0xff99cc00);

                        points_c++;
                        textView.setText(points_p + " - " + points_c + "\n Round " + j);


                    }

                    if(j == rounds){
                        if(points_p>points_c){
                            textView.setText(points_p + " - " + points_c + "\n YOU WON😀😀😀");
                            view.setBackgroundColor(Color.GREEN);
                        }
                        else if(points_p==points_c){
                            textView.setText(points_p + " - " + points_c + "\n It's a draw");
                        }
                        else {
                            textView.setText(points_p + " - " + points_c + "\n YOU LOST😭😭😭");
                            view.setBackgroundColor(Color.RED);

                        }
                    }
                    j++;
                }
            }
        });


        ImageView player2_scissors = (ImageView) findViewById(R.id.comp_player1_scissors);
        player2_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(j<=rounds) {

                    comp_image = (ImageView) findViewById(R.id.comp_image);

                    TextView textView = (TextView) findViewById(R.id.comp_score);

                    flag[0] = true;

                    player1_choice = "scissors";

                    player_image = (ImageView) findViewById(R.id.player_image);
                    player_image.setImageResource(R.drawable.scissors2);
                    player_image.setBackgroundColor(0xff99cc00);

                    computergame_activity obj = new computergame_activity();
                    comp_choice = obj.getRandomElement_random_options(choices);

                    if (comp_choice.equals("rock")) {
                        comp_image.setImageResource(R.drawable.rock2);
                        comp_image.setBackgroundColor(0xff00ddff);

                        points_c++;
                        textView.setText(points_p + " - " + points_c + "\n Round " + j);


                    }

                    if (comp_choice.equals("paper")) {
                        comp_image.setImageResource(R.drawable.paper1);
                        comp_image.setBackgroundColor(0xffff4444);

                        points_p++;
                        textView.setText(points_p + " - " + points_c + "\n Round " + j);

                    }

                    if (comp_choice.equals("scissors")) {
                        comp_image.setImageResource(R.drawable.scissors2);
                        comp_image.setBackgroundColor(0xff99cc00);

                        textView.setText(points_p + " - " + points_c + "\n Round " + j);

                    }

                    if(j == rounds){
                        if(points_p>points_c){
                            textView.setText(points_p + " - " + points_c + "\n YOU WON😀😀😀");
                            view.setBackgroundColor(Color.GREEN);
                        }
                        else if(points_p==points_c){
                            textView.setText(points_p + " - " + points_c + "\n It's a draw");
                        }
                        else {
                            textView.setText(points_p + " - " + points_c + "\n YOU LOST😭😭😭");
                            view.setBackgroundColor(Color.RED);

                        }
                    }
                    j++;
                }
            }

        });


//        if (flag[0]) {
//            if (j < rounds) {
//                if (player1_choice.equals(comp_choice)) {
//                    textView.setText(points_p + " - " + points_c + "\n Round " + j);
//                } else if (player1_choice.equals("rock") && comp_choice.equals("scissors")) {
//                    points_p++;
//                    textView.setText(points_p + " - " + points_c + "\n Round " + j);
//                } else if (player1_choice.equals("paper") && comp_choice.equals("rock")) {
//                    points_p++;
//                    textView.setText(points_p + " - " + points_c + "\n Round " + j);
//                } else if (player1_choice.equals("scissors") && comp_choice.equals("paper")) {
//                    points_p++;
//                    textView.setText(points_p + " - " + points_c + "\n Round " + j);
//                } else if (player1_choice.equals("scissors") && comp_choice.equals("rock")) {
//                    points_c++;
//                    textView.setText(points_p + " - " + points_c + "\n Round " + j);
//                } else if (player1_choice.equals("rock") && comp_choice.equals("paper")) {
//                    points_c++;
//                    textView.setText(points_p + " - " + points_c + "\n Round " + j);
//                } else if (player1_choice.equals("paper") && comp_choice.equals("scissors")) {
//                    points_c++;
//                    textView.setText(points_p + " - " + points_c + "\n Round " + j);
//                }
//
//                j++;
//
//
//            }
//            flag[0] = false;
//        }
//

    }

    @Override
    public void onBackPressed(){
        NavUtils.navigateUpFromSameTask(this);
    }


    public String getRandomElement_random_options(List<String> random_options) {
        Random rand_randopt = new Random();
        return random_options.get(rand_randopt.nextInt(random_options.size()));
    }
}
