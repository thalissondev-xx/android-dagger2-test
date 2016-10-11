package br.com.thalisson.dagger.contract;

import android.content.SharedPreferences;

import br.com.thalisson.dagger.domain.Car;
import br.com.thalisson.dagger.module.CarModule;
import br.com.thalisson.dagger.scope.PerActivity;
import dagger.Component;

/**
 * Created by Team Fretebras Android on 10/10/16.
 */

@PerActivity
@Component(
        dependencies = {
                ApplicationComponent.class
        },
        modules = {
                CarModule.class
        }
)
public interface CarComponent {
    void inject(Car car);

    SharedPreferences providePreferences();
    Car provideCar();
}
