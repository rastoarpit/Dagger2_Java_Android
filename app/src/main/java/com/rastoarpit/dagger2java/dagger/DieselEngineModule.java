package com.rastoarpit.dagger2java.dagger;

import com.rastoarpit.dagger2java.car.DieselEngine;
import com.rastoarpit.dagger2java.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}