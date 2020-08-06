package com.example.android.zarafashion;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class QuizActivityQuestion4 extends AppCompatActivity {

    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private Intent i;
    private Intent mIntent;
    int numberOfPointsForBohemian=0;
    int numberOfPointsForChic=0;
    int numberOfPointsForVintage=0;
    int numberOfPointForCasual=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_question4);

        imageButton1= (ImageButton) findViewById(R.id.imageButton1);
        imageButton2= (ImageButton) findViewById(R.id.imageButton2);
        imageButton3= (ImageButton) findViewById(R.id.imageButton3);
        imageButton4= (ImageButton) findViewById(R.id.imageButton4);
        i= new Intent(this, QuizActivityQuestion5.class);
        mIntent=getIntent();
        numberOfPointsForBohemian=mIntent.getIntExtra("BOHEMIAN",0);
        numberOfPointsForChic=mIntent.getIntExtra("CHIC",0);
        numberOfPointsForVintage=mIntent.getIntExtra("VINTAGE",0);
        numberOfPointForCasual=mIntent.getIntExtra("CASUAL",0);
    }

    public void bohemianIsChosen(View v)
    {
        numberOfPointsForBohemian++;
        imageButton1.setAlpha(125);
        imageButton2.setAlpha(125);
        imageButton3.setAlpha(125);
        imageButton4.setAlpha(125);
        imageButton1.setEnabled(false);
        imageButton2.setEnabled(false);
        imageButton3.setEnabled(false);
        imageButton4.setEnabled(false);
        i.putExtra("BOHEMIAN",numberOfPointsForBohemian);
        i.putExtra("CHIC",numberOfPointsForChic);
        i.putExtra("VINTAGE",numberOfPointsForVintage);
        i.putExtra("CASUAL", numberOfPointForCasual);
        startActivity(i);
    }

    public void chicIsChosen(View v)
    {
        numberOfPointsForChic++;
        imageButton1.setAlpha(125);
        imageButton2.setAlpha(125);
        imageButton3.setAlpha(125);
        imageButton4.setAlpha(125);
        imageButton1.setEnabled(false);
        imageButton2.setEnabled(false);
        imageButton3.setEnabled(false);
        imageButton4.setEnabled(false);
        i.putExtra("BOHEMIAN",numberOfPointsForBohemian);
        i.putExtra("CHIC",numberOfPointsForChic);
        i.putExtra("VINTAGE",numberOfPointsForVintage);
        i.putExtra("CASUAL", numberOfPointForCasual);
        startActivity(i);


    }


    public void vintageIsChosen(View v)
    {
        numberOfPointsForVintage++;
        imageButton1.setAlpha(125);
        imageButton2.setAlpha(125);
        imageButton3.setAlpha(125);
        imageButton4.setAlpha(125);
        imageButton1.setEnabled(false);
        imageButton2.setEnabled(false);
        imageButton3.setEnabled(false);
        imageButton4.setEnabled(false);
        i.putExtra("BOHEMIAN",numberOfPointsForBohemian);
        i.putExtra("CHIC",numberOfPointsForChic);
        i.putExtra("VINTAGE",numberOfPointsForVintage);
        i.putExtra("CASUAL", numberOfPointForCasual);
        startActivity(i);



    }

    public void casualIsChosen(View v)
    {
        numberOfPointForCasual++;
        imageButton1.setAlpha(125);
        imageButton2.setAlpha(125);
        imageButton3.setAlpha(125);
        imageButton4.setAlpha(125);
        imageButton1.setEnabled(false);
        imageButton2.setEnabled(false);
        imageButton3.setEnabled(false);
        imageButton4.setEnabled(false);
        i.putExtra("BOHEMIAN",numberOfPointsForBohemian);
        i.putExtra("CHIC",numberOfPointsForChic);
        i.putExtra("VINTAGE",numberOfPointsForVintage);
        i.putExtra("CASUAL", numberOfPointForCasual);
        startActivity(i);

    }

}