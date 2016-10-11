package br.com.thalisson.dagger.contract;

import javax.inject.Singleton;

import br.com.thalisson.dagger.MainActivity;
import br.com.thalisson.dagger.module.AppModule;
import br.com.thalisson.dagger.module.NetModule;
import dagger.Component;

/**
 * Created by Team Fretebras Android on 11/10/16.
 */

@Singleton
@Component(
        modules = {
                AppModule.class,
                NetModule.class
        }
)
public interface NetComponent {
    void inject(MainActivity mainActivity);
}
