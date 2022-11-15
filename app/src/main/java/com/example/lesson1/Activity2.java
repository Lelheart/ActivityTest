package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button3:
                Toast.makeText(this, "Нажата кнопка 1", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button4:
                Toast.makeText(this, "Нажата кнопка 2", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button5:
                Toast.makeText(this, "Нажата кнопка 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.toAct3:
                Intent intent = new Intent(this, Activity3.class);
                startActivity(intent);
        }
    }
}