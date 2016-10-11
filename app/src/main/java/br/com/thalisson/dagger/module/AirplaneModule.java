package br.com.thalisson.dagger.module;

import android.util.Log;

import br.com.thalisson.dagger.domain.LandingGear;
import br.com.thalisson.dagger.scope.PerActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Team Fretebras Android on 11/10/16.
 */

@Module
public class AirplaneModule {
    @Provides
    @PerActivity
    public LandingGear provideLandingGear() {
        Log.i("checkin", "provideLandingGear");
        return new LandingGear();
    }
}
