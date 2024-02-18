package com.example.naser;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private EditText a;
    private EditText b;
    private EditText c;
    private Button but;
    private TextView num;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but=findViewById(R.id.but);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=findViewById(R.id.a);
                b=findViewById(R.id.b);
                c=findViewById(R.id.c);
                num=findViewById(R.id.num);
                int a1=Integer.parseInt(a.getText().toString());
                int b1=Integer.parseInt(b.getText().toString());
                int c1=Integer.parseInt(c.getText().toString());
                if((b1*b1-4*a1*c1)<0) {
                    num.setText("no solution");
                    return;
                }

                double x1=(-b1+Math.sqrt(b1*b1-4*a1*c1))/2*a1;
                double x2= (-b1-Math.sqrt(b1*b1-4*a1*c1))/2*a1;
                if(x1==x2)
                    num.setText(x1+"");
                else
                    num.setText(x1+" "+"or"+" "+x2);
            }
        });
    }


}