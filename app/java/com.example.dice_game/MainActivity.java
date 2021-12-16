package com.example.dice_game;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void announce(View view){
         Random r1 = new Random();
         Random r2 = new Random();
         int user = r1.nextInt(6)+1;
         int comp = r2.nextInt(6)+1;
         ImageView uimg = findViewById(R.id.imageView2);
         ImageView cimg = findViewById(R.id.imageView3);
         TextView t = findViewById(R.id.textView2);
         if (user == 1) uimg.setImageResource(R.drawable.one);
         else if (user == 2) uimg.setImageResource(R.drawable.two);
         else if (user == 3) uimg.setImageResource(R.drawable.three);
         else if (user == 4) uimg.setImageResource(R.drawable.four);
         else if (user == 5) uimg.setImageResource(R.drawable.five);
         else if (user == 6) uimg.setImageResource(R.drawable.six);

        if (comp == 1) cimg.setImageResource(R.drawable.one);
        else if (comp == 2) cimg.setImageResource(R.drawable.two);
        else if (comp == 3) cimg.setImageResource(R.drawable.three);
        else if (comp == 4) cimg.setImageResource(R.drawable.four);
        else if (comp == 5) cimg.setImageResource(R.drawable.five);
        else if (comp == 6) cimg.setImageResource(R.drawable.six);

        if (user == comp) t.setText("Result : Draw");
        else if (user > comp) t.setText("Winner : PLAYER");
        else t.setText("Winner : COMPUTER");
    }
}
