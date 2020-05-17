package com.rastoarpit.dagger2java.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject
    Engine engine; //2. Field injection
    private Wheels wheels;
    private Driver driver;

    @Inject
    public Car(Driver driver, Wheels wheels) {//1. Constructor injection
        //If we have constructor injection - Field and Method are also injected automatically

        this.driver = driver;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {//3. Method injection
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " is driving the car " + this);
    }
}
