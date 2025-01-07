package com.example.ex06031;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView textV;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        textV = findViewById(R.id.textV);
        count = 0;

    }

    public void ohyea(View view) {
        textV.setWidth(50);
        count++;
        if (count != 6)
        {
            textV.setText("This is a click number: " + count);
        }
        else
        {
            textV.setText("Enough to click. Go to new start!");
            count = 0;
        }

    }
}