package com.rastoarpit.dagger2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    //Directed Acyclic Graph (DAG)ger

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CarComponent carComponent = DaggerCarComponent.create();

//        car = carComponent.getCar();

        carComponent.inject(this);

        car.drive();
    }
}
