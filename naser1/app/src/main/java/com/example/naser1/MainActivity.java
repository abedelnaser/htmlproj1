package com.example.naser1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView but1;
    private TextView but2;
    private TextView but3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1=findViewById(R.id.but1);
        but2=findViewById(R.id.but2);
        but3=findViewById(R.id.but3);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable c1=but1.getBackground();
                but1.setBackground(but2.getBackground());
                but2.setBackground(c1);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable c2=but2.getBackground();
                but2.setBackground(but3.getBackground());
                but3.setBackground(c2);
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable c3=but3.getBackground();
                but3.setBackground(but1.getBackground());
                but1.setBackground(c3);
            }
        });
    }
}