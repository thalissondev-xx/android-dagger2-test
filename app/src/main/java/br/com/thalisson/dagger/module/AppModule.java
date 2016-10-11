package br.com.thalisson.dagger.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Team Fretebras Android on 11/10/16.
 */

@Module
public class AppModule {
    Application mApplication;

    public AppModule(Application app) {
        mApplication = app;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return mApplication;
    }
}
