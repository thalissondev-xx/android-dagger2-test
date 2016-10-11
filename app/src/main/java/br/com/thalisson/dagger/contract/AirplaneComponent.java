package br.com.thalisson.dagger.contract;

import br.com.thalisson.dagger.domain.Airplane;
import br.com.thalisson.dagger.module.AirplaneModule;
import br.com.thalisson.dagger.scope.PerActivity;
import dagger.Component;

/**
 * Created by Team Fretebras Android on 11/10/16.
 */

@PerActivity
@Component (
        modules = {
                AirplaneModule.class
        }
)
public interface AirplaneComponent {
    void inject(Airplane airplane);

    Airplane provideAirplane();
}