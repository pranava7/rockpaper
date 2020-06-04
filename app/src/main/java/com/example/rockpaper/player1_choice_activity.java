package com.example.rockpaper;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

public class player1_choice_activity extends AppCompatActivity {


    public static  String player1choice_string;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.player1_choice);

        TextView t = (TextView) findViewById(R.id.text1) ;
        t.setText(MainActivity.player1name + "'s Choice");



        ImageView player1_rock = (ImageView) findViewById(R.id.player1_rock);
        player1_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ImageView player1_choice = (ImageView) findViewById(R.id.player1_choice);
//                player1_choice.setImageResource(R.drawable.rock2);
//                player1_choice.setBackgroundColor(0xff00ddff);


                player1choice_string = "rock";



                    Intent colorsIntent = new Intent(player1_choice_activity.this, player2_choice_activity.class);

                    startActivity(colorsIntent);




            }
        });

        ImageView player1_paper = (ImageView) findViewById(R.id.player1_paper);
        player1_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ImageView player1_choice = (ImageView) findViewById(R.id.player1_choice);
//                player1_choice.setImageResource(R.drawable.paper1);
//                player1_choice.setBackgroundColor(0xffff4444);


                player1choice_string = "paper";


                    Intent colorsIntent = new Intent(player1_choice_activity.this, player2_choice_activity.class);

                    startActivity(colorsIntent);



            }
        });

        ImageView player1_scissors = (ImageView) findViewById(R.id.player1_scissors);
        player1_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ImageView player1_choice = (ImageView) findViewById(R.id.player1_choice);
//                player1_choice.setImageResource(R.drawable.scissors2);
//                player1_choice.setBackgroundColor(0xff99cc00);

                player1choice_string = "scissors";



                Intent colorsIntent = new Intent(player1_choice_activity.this, player2_choice_activity.class);

                    startActivity(colorsIntent);



            }
        });
    }

    @Override
    public void onBackPressed(){
        NavUtils.navigateUpFromSameTask(this);
        player2game.i = 1;
        player2game.points1 = 0;
        player2game.points2 = 0;
    }


}
