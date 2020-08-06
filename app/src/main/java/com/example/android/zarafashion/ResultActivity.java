package com.example.android.zarafashion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private Intent mIntent;
    private TextView resultTextview;
    private ImageView resultImageView;


    int numberOfPointsForBohemian = 0;
    int numberOfPointsForChic = 0;
    int numberOfPointsForVintage = 0;
    int numberOfPointForCasual = 0;
    int max = -1;
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultTextview = findViewById(R.id.id_result);
        resultImageView = findViewById(R.id.id_result_image);

        mIntent = getIntent();
        numberOfPointsForBohemian = mIntent.getIntExtra("BOHEMIAN", 0);
        numberOfPointsForChic = mIntent.getIntExtra("CHIC", 0);
        numberOfPointsForVintage = mIntent.getIntExtra("VINTAGE", 0);
        numberOfPointForCasual = mIntent.getIntExtra("CASUAL", 0);
        if (numberOfPointsForBohemian >= max) max = numberOfPointsForBohemian;
        if (numberOfPointsForChic >= max) max = numberOfPointsForChic;
        if (numberOfPointsForVintage >= max) max = numberOfPointsForVintage;
        if (numberOfPointForCasual >= max) max = numberOfPointForCasual;

        if (max == numberOfPointsForBohemian) {
            resultTextview.setText(R.string.bohemian);
            resultImageView.setImageResource(R.drawable.bohemian_style);
        }
        if (max == numberOfPointsForChic) {
            resultTextview.setText(R.string.chic);
            resultImageView.setImageResource(R.drawable.chic_style);
        }
        if (max == numberOfPointsForVintage) {
            resultTextview.setText(R.string.vintage);
            resultImageView.setImageResource(R.drawable.vintage_style);
        }
        if (max == numberOfPointForCasual) {
            resultTextview.setText(R.string.casual);
            resultImageView.setImageResource(R.drawable.casual_style);
        }
    }

    public void onClick1(View v) {
        Intent i = new Intent(this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}



