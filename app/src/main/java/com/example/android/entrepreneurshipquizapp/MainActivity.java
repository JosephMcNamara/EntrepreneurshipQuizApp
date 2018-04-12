package com.example.android.entrepreneurshipquizapp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int scoreQ1 = 0;
    int scoreQ2 = 0;
    int scoreQ3 = 0;
    int scoreQ4 = 0;
    RadioButton questionOneAnswer;
    EditText questionTwoAnswer;
    RadioButton questionThreeAnswer;
    CheckBox questionFourAnswer;
    String correctAnswer1 = "False";
    String correctAnswer2 = "French";
    String correctAnswer3 = "False";
    String correctAnswer4 = "Various Factors";
    String incorrectAnswer4a = "Money";
    String incorrectAnswer4b = "Social Impact";
    String incorrectAnswer4c = "Their Egos";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScore(View view) {
        questionOneAnswer = (RadioButton) findViewById(R.id.questionOneAnswerB);
        Boolean selectedAnswer1 = questionOneAnswer.isChecked();
        if (selectedAnswer1) {
            scoreQ1 = 1;
        }
        questionTwoAnswer = (EditText) findViewById(R.id.questionTwoAnswer);
        String selectedAnswer2 = questionTwoAnswer.getText().toString();
        if (selectedAnswer2.equals(correctAnswer2)) {
            scoreQ2 = 1;
        }
        questionThreeAnswer = (RadioButton) findViewById(R.id.questionThreeAnswerB);
        String selectedAnswer3 = questionThreeAnswer.getText().toString();
        if (selectedAnswer3.equals(correctAnswer3)) {
            scoreQ3 = 1;
        }
        questionFourAnswer = (CheckBox) findViewById(R.id.questionFourAnswer);
        String selectedAnswer4 = questionFourAnswer.getText().toString();
        if (selectedAnswer4.equals(correctAnswer4) && (selectedAnswer4.equals(correctAnswer4))) {
            scoreQ4 = 1;
        }
        score = scoreQ1 + scoreQ2 + scoreQ3 + scoreQ4;
        Toast.makeText(getApplicationContext(), "Your score is " + score, Toast.LENGTH_LONG).show();
    }
}