package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Question [] question = new Question[5];

    TextView txt;

    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question[0] = new Question("Москва столица России?", true);
        question[1] = new Question("Питер столица России?", false);
        question[2] = new Question("Байкал самое больше озеро?", true);
        question[3] = new Question("Амазонка самая длинная река?", true);
        question[4] = new Question("Игорь женское имя?", false);

        txt = findViewById(R.id.txt_question);
        txt.setText(question[0].getQues());
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button_next:
                counter++;
                if (counter < question.length) {
                    txt.setText(question[counter].getQues());
                } else {
                    counter = -1;
                }
                break;

            case R.id.button_true:
                if (question[counter].isAnsw() == true) {
                    Toast.makeText(this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Не правильно", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.button_false:
                if (question[counter].isAnsw() == false) {
                    Toast.makeText(this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Не правильно", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.toAct2:
                Intent act2 = new Intent(this, Activity2.class);
                startActivity(act2);

            case R.id.toAct3:
                Intent act3 = new Intent(this, Activity3.class);
                startActivity(act3);

        }


    }
}