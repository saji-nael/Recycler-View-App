package com.example.vehicle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cars_recycler);
        String[] captions = new String[Car.cars.length];
        int id[] = new int[Car.cars.length];
        for (int x = 0; x < captions.length; x++) {
            captions[x] = Car.cars[x].getName();
            id[x] = Car.cars[x].getImageID();
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImageAdapter adapter = new CaptionedImageAdapter(captions, id);
        recyclerView.setAdapter(adapter);
    }
    public  void  show(){
        Toast.makeText(getApplicationContext(), "This is my Toast message!",
                Toast.LENGTH_LONG).show();
    }

}