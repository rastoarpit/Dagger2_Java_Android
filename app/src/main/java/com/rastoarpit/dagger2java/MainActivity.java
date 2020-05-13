package com.rastoarpit.dagger2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Directed Acyclic Graph (DAG)ger

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CarComponent carComponent = DaggerCarComponent.create();

        car = carComponent.getCar();
        car.drive();
    }
}
