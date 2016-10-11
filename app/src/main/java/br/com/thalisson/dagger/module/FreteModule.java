package br.com.thalisson.dagger.module;

import br.com.thalisson.dagger.domain.Frete;
import br.com.thalisson.dagger.scope.PerActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Team Fretebras Android on 11/10/16.
 */

@Module
public class FreteModule {
    @Provides
    @PerActivity
    public Frete provideFrete() {
        return new Frete();
    }
}
