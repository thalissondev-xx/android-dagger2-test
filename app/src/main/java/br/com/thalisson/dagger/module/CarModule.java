package br.com.thalisson.dagger.module;

import android.util.Log;

import br.com.thalisson.dagger.domain.Car;
import br.com.thalisson.dagger.domain.Car2;
import br.com.thalisson.dagger.domain.Direction;
import br.com.thalisson.dagger.domain.Engine;
import br.com.thalisson.dagger.scope.PerActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Team Fretebras Android on 10/10/16.
 */

@Module
public class CarModule {
    @Provides
    @PerActivity
    public Engine provideEngine() {
        Log.i("checkin", "provideEngine");
        return new Engine();
    }

    @Provides
    @PerActivity
    public Car provideCar() {
        Log.i("checkin", "provideCar");
        return new Car2();
    }

    @Provides
    @PerActivity
    public Direction provideDirection() {
        Log.i("checkin", "provideDirection");
        return new Direction();
    }
}