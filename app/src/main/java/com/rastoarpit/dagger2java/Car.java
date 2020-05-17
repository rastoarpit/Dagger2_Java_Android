package com.rastoarpit.dagger2java;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

     @Inject Engine engine; //2. Field injection
     private Wheels wheels;

     @Inject
    public Car(Wheels wheels) {//1. Constructor injection
         //If we have constructor injection - Field and Method are also injected automatically
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){//3. Method injection
         remote.setListener(this);
    }

    public void drive(){
        Log.d(TAG, "driving...");
    }
}
