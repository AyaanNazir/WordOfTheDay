package com.example.wordoftheday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random);
        Button starred = (Button) findViewById(R.id.Starred);
        starred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RandomActivity.this, StarredActivity.class));
            }
        });
        Button random = (Button) findViewById(R.id.Random);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RandomActivity.this, StarredActivity.class));
            }
        });
        Button words = (Button) findViewById(R.id.words);
        words.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RandomActivity.this, MainActivity.class));
            }
        });
    }
}

