package com.rastoarpit.dagger2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rastoarpit.dagger2java.car.Car;
import com.rastoarpit.dagger2java.dagger.CarComponent;
import com.rastoarpit.dagger2java.dagger.DaggerCarComponent;
import com.rastoarpit.dagger2java.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    //Directed Acyclic Graph (DAG)ger

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        CarComponent carComponent = DaggerCarComponent.create();
        //        car = carComponent.getCar();

        CarComponent carComponent = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();
        carComponent.inject(this);

        car1.drive();
        car2.drive();
    }
}
