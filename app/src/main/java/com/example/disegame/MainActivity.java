package com.example.disegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // we have two image left die and right die
        // like the code to those two image view inside your (activity main)
        ImageView leftdie = findViewById(R.id.left_die);
        ImageView rightdie = findViewById(R.id.right_die);
        ImageView Result = findViewById(R.id.imageView);

        Button Higher = findViewById(R.id.Higher);
        Button Lower = findViewById(R.id.Lower);



        int [] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        Higher.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Random rand = new Random();

                int randLeftDie = rand.nextInt(6);
                int randrightDie = rand.nextInt(6);
                Log.d("left die",Integer.toString(randLeftDie)); // lags are inform of
                Log.d("right die",Integer.toString(randrightDie));
                leftdie.setImageResource(diceArray[randLeftDie]);
                rightdie.setImageResource(diceArray[randrightDie]);
                if(diceArray[randLeftDie]<diceArray[randrightDie])
                {

                    Result.setImageResource(R.drawable.b2);

                }
                else if(diceArray[randLeftDie]>diceArray[randrightDie])
                {

                    Result.setImageResource(R.drawable.a1);
                }
                else
                {

                    Result.setImageResource(R.drawable.c3);

                }

            }



        });
        Lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Random rand = new Random();

                int randLeftDie = rand.nextInt(6);
                int randrightDie = rand.nextInt(6);
                Log.d("left die", Integer.toString(randLeftDie)); // lags are inform of
                Log.d("right die", Integer.toString(randrightDie));
                leftdie.setImageResource(diceArray[randLeftDie]);
                rightdie.setImageResource(diceArray[randrightDie]);
                if (diceArray[randLeftDie] > diceArray[randrightDie]) {

                    Result.setImageResource(R.drawable.b2);

                }
                else if (diceArray[randLeftDie] < diceArray[randrightDie])
                {

                    Result.setImageResource(R.drawable.a1);

                } else
                {

                    Result.setImageResource(R.drawable.c3);


                }

            }
        });
    }
}