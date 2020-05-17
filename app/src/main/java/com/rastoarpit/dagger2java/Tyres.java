package com.rastoarpit.dagger2java;

import android.util.Log;

public class Tyres {
    //we don't own this class so we can't annotate it with @Inject
    private static final String TAG = "Car";

    public void inflate() {
        Log.d(TAG, "Tyres inflated");
    }
}
