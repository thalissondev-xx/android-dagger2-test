package br.com.thalisson.dagger;

import android.app.Application;

import br.com.thalisson.dagger.contract.ApplicationComponent;
import br.com.thalisson.dagger.contract.DaggerApplicationComponent;
import br.com.thalisson.dagger.module.ApplicationModule;

/**
 * Created by Team Fretebras Android on 10/10/16.
 */

public class AndroidApplication extends Application {
    private ApplicationComponent  mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
