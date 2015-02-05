package com.example.equifilm.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ObjectInputStream;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void button1_click(View view) {
        //if nr1 groter dan nr 2 -> pop up correct ++ score

        // value nr1 en nr2 ophalen

        //value 1
        TextView knop1 = (TextView) findViewById(R.id.number1);

        //get string
        String tekst1 = (String) knop1.getText();

        //cast to int
        int waarde1 = Integer.parseInt(String.valueOf(tekst1));

        //value 2
        TextView knop2 = (TextView) findViewById(R.id.number2);

        //get string
        String tekst2 = (String) knop2.getText();

        //cast to int
        int waarde2 = Integer.parseInt(String.valueOf(tekst2));


        //1. compare 1 met 2
        if ( waarde1 > waarde2 ) {
            //pop up: je hebt gelijk
            Toast.makeText(this,
                    "Je hebt gelijk",
                    Toast.LENGTH_SHORT).show();

            //counter +1
            //get counter
            TextView counter = (TextView) findViewById(R.id.score);

            //get string
            String punten = (String) counter.getText();

            //cast to int
            int puntjes = Integer.parseInt(String.valueOf(punten));

            // punten +1
            int i = puntjes + 1;

            //terugcasten naar een tekst
            String puntenaantal = Integer.toString(i);

            //set
            counter.setText(puntenaantal);

            // new rAndom nrs in button 1 + 2
        }

        else {
            // pop up: je bent een idioot
            Toast.makeText(this,
                    "Je bent een idioot",
                    Toast.LENGTH_SHORT).show();
            // counter -1
            //get counter
            TextView counter = (TextView) findViewById(R.id.score);

            //get string
            String punten = (String) counter.getText();

            //cast to int
            int puntjes = Integer.parseInt(String.valueOf(punten));

            // punten +1
            int i = puntjes - 1;

            //terugcasten naar een tekst
            String puntenaantal = Integer.toString(i);

            //set
            counter.setText(puntenaantal);
        }

        //nieuwe randoms
        // create two randoms
        int rand1 = (int )(Math.random() * 50 + 1);
        int rand2 = (int )(Math.random() * 50 + 1);

        //cast to text
        String random1 = Integer.toString(rand1);
        String random2 = Integer.toString(rand2);

        //Get buttons
        TextView knopje1 = (TextView) findViewById(R.id.number1);
        TextView knopje2 = (TextView) findViewById(R.id.number2);

        //set to buttons
        knopje1.setText(random1);
        knopje2.setText(random2);
    }

    public void button2_click(View view) {
        //if nr2 groter dan nr 1 -> pop up correct ++ score

        // value nr1 en nr2 ophalen

        //value 1
        TextView knop1 = (TextView) findViewById(R.id.number1);

        //get string
        String tekst1 = (String) knop1.getText();

        //cast to int
        int waarde1 = Integer.parseInt(String.valueOf(tekst1));

        //value 2
        TextView knop2 = (TextView) findViewById(R.id.number2);

        //get string
        String tekst2 = (String) knop2.getText();

        //cast to int
        int waarde2 = Integer.parseInt(String.valueOf(tekst2));


        //1. compare 1 met 2
        if ( waarde1 < waarde2 ) {
            //pop up: je hebt gelijk
            Toast.makeText(this,
                    "Je hebt gelijk",
                    Toast.LENGTH_SHORT).show();

            //counter +1
            //get counter
            TextView counter = (TextView) findViewById(R.id.score);

            //get string
            String punten = (String) counter.getText();

            //cast to int
            int puntjes = Integer.parseInt(String.valueOf(punten));

            // punten +1
            int i = puntjes + 1;

            //terugcasten naar een tekst
            String puntenaantal = Integer.toString(i);

            //set
            counter.setText(puntenaantal);

        }
        else {
            // pop up: je bent een idioot
            Toast.makeText(this,
                    "Je bent een idioot",
                    Toast.LENGTH_SHORT).show();
            // counter -1
            //get counter
            TextView counter = (TextView) findViewById(R.id.score);

            //get string
            String punten = (String) counter.getText();

            //cast to int
            int puntjes = Integer.parseInt(String.valueOf(punten));

            // punten +1
            int i = puntjes - 1;

            //terugcasten naar een tekst
            String puntenaantal = Integer.toString(i);

            //set
            counter.setText(puntenaantal);
        }

        //nieuwe randoms
        // create two randoms
        int rand1 = (int )(Math.random() * 50 + 1);
        int rand2 = (int )(Math.random() * 50 + 1);

        //cast to text
        String random1 = Integer.toString(rand1);
        String random2 = Integer.toString(rand2);

        //Get buttons
        TextView knopje1 = (TextView) findViewById(R.id.number1);
        TextView knopje2 = (TextView) findViewById(R.id.number2);

        //set to buttons
        knopje1.setText(random1);
        knopje2.setText(random2);

    }
}
