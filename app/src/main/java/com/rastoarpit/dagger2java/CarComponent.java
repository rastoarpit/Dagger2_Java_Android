package com.rastoarpit.dagger2java;

import dagger.Component;

@Component
public interface CarComponent {//The Injector

    //Constructor injection
    Car getCar();

    //Field injection
    void inject(MainActivity mainActivity);
}
