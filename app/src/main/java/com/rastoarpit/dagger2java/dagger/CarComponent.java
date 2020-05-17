package com.rastoarpit.dagger2java.dagger;

import com.rastoarpit.dagger2java.MainActivity;
import com.rastoarpit.dagger2java.car.Car;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {//The Injector

    //Constructor injection
    Car getCar();

    //Field injection
    void inject(MainActivity mainActivity);
}
