package com.rastoarpit.dagger2java;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {//The Injector

    //Constructor injection
    Car getCar();

    //Field injection
    void inject(MainActivity mainActivity);
}
