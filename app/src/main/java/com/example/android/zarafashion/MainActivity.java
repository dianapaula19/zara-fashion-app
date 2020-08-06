package com.example.android.zarafashion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t2 = (TextView) findViewById(R.id.linkTextView);
        t2.setMovementMethod(LinkMovementMethod.getInstance());


    }
    public void onClick(View v)
    {
        startActivity(new Intent(this, QuizActivityQuestion1.class));
    }




}
