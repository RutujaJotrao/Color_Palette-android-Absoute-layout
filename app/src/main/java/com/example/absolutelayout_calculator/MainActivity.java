package com.example.absolutelayout_calculator;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsoluteLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    AbsoluteLayout a1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        a1=findViewById(R.id.main);
    }

    public void cyan(View view) {
        a1.setBackgroundColor(Color.CYAN);
    }


    public void snow(View view) {
        int color = Color.parseColor("#FFFAFA");
        a1.setBackgroundColor(color);
    }


    public void Moccasin(View view){
        int color = Color.parseColor("#FFE4B5");
        a1.setBackgroundColor(color);
    }


    public void SeaGreen(View view){
        int color = Color.parseColor("#2E8B57");
        a1.setBackgroundColor(color);
    }

    public void Bisque(View view){
        int color = Color.parseColor("#FFE4C4");
        a1.setBackgroundColor(color);
    }

    public void Gold(View view){
        int color = Color.parseColor("#FFD700");
        a1.setBackgroundColor(color);
    }

    public void LightPink(View view){
        int color = Color.parseColor("#FFB6C1");
        a1.setBackgroundColor(color);
    }

    public void Fuchsia(View view){
        int color = Color.parseColor("#FF00FF");
        a1.setBackgroundColor(color);
    }

    public void Violet(View view){
        int color = Color.parseColor("#EE82EE");
        a1.setBackgroundColor(color);
    }

    public void RosyBrown(View view){
        int color = Color.parseColor("#BC8F8F");
        a1.setBackgroundColor(color);
    }
}