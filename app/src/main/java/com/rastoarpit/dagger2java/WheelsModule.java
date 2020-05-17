package com.rastoarpit.dagger2java;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {//This is used to create object graph for classes we do not own and can not inject their constructor directly

    @Provides
    Rims provideRims() {
        return new Rims();
    }

    @Provides
    Tyres provideTyres() {
        Tyres tyres = new Tyres();
        tyres.inflate();
        return new Tyres();
    }

    @Provides
    Wheels provideWheels(Rims rims, Tyres tyres) {
        return new Wheels(rims, tyres);
    }

}
