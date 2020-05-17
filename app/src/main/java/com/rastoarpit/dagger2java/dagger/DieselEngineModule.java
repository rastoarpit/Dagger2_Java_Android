package com.rastoarpit.dagger2java.dagger;

import com.rastoarpit.dagger2java.car.DieselEngine;
import com.rastoarpit.dagger2java.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine() {
        return new DieselEngine(horsePower);
    }
}