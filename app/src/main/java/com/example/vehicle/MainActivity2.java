package com.example.vehicle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private TextView details;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        ImageView imageView = (ImageView) findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(getApplicationContext(), Car.cars[Integer.parseInt(intent.getStringExtra("index"))].getImageID());
        imageView.setImageDrawable(dr);


        details = findViewById(R.id.showDetails);
        details.setText(Car.cars[Integer.parseInt(intent.getStringExtra("index"))].toString());
    }
}