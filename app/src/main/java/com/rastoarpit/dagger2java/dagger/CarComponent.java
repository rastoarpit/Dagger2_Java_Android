package com.rastoarpit.dagger2java.dagger;

import com.rastoarpit.dagger2java.MainActivity;
import com.rastoarpit.dagger2java.car.Car;

import dagger.Component;

@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {//The Injector

    //Constructor injection
    Car getCar();

    //Field injection
    void inject(MainActivity mainActivity);
}
