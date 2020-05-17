package com.rastoarpit.dagger2java.dagger;

import com.rastoarpit.dagger2java.car.Rims;
import com.rastoarpit.dagger2java.car.Tyres;
import com.rastoarpit.dagger2java.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {//This is used to create object graph for classes we do not own and can not inject their constructor directly
//if all methods are static, then make this class abstract
    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tyres provideTyres() {
        Tyres tyres = new Tyres();
        tyres.inflate();
        return new Tyres();
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tyres tyres) {
        return new Wheels(rims, tyres);
    }

}
