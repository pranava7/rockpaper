package com.example.rockpaper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

public class player2_choice_activity extends AppCompatActivity {

    public static String player2choice_string;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.player2_choice);

        TextView t = (TextView) findViewById(R.id.text2) ;
        t.setText(MainActivity.player2name + "'s Choice");




        ImageView player2_rock = (ImageView) findViewById(R.id.player2_rock);
        player2_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ImageView player1_choice = (ImageView) findViewById(R.id.player2_choice);
//                player1_choice.setImageResource(R.drawable.rock2);
//                player1_choice.setBackgroundColor(0xff00ddff);

                player2choice_string = "rock" ;



                    Intent colorsIntent = new Intent(player2_choice_activity.this, player2game.class);

                    // Start the new activity
                    startActivity(colorsIntent);


            }
        });

        ImageView player2_paper = (ImageView) findViewById(R.id.player2_paper);
        player2_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ImageView player2_choice = (ImageView) findViewById(R.id.player2_choice);
//                player2_choice.setImageResource(R.drawable.paper1);
//                player2_choice.setBackgroundColor(0xffff4444);



                player2choice_string = "paper" ;


                    Intent colorsIntent = new Intent(player2_choice_activity.this, player2game.class);

                    // Start the new activity
                    startActivity(colorsIntent);


            }
        });

        ImageView player2_scissors = (ImageView) findViewById(R.id.player2_scissors);
        player2_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ImageView player2_choice = (ImageView) findViewById(R.id.player2_choice);
//                player2_choice.setImageResource(R.drawable.scissors2);
//                player2_choice.setBackgroundColor(0xff99cc00);



                player2choice_string = "scissors" ;

                    Intent colorsIntent = new Intent(player2_choice_activity.this, player2game.class);

                    // Start the new activity
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
