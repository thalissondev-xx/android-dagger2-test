package br.com.thalisson.dagger.contract;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import br.com.thalisson.dagger.module.ApplicationModule;
import dagger.Component;

/**
 * Created by Team Fretebras Android on 10/10/16.
 */

@Singleton
@Component(
        modules = {
                ApplicationModule.class
        }
)
public interface ApplicationComponent {
    SharedPreferences providePreferences();
}
