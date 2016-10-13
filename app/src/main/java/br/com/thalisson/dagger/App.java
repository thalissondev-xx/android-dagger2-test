package br.com.thalisson.dagger;

import android.app.Application;

import br.com.thalisson.dagger.contract.DaggerNetComponent;
import br.com.thalisson.dagger.contract.NetComponent;
import br.com.thalisson.dagger.module.AppModule;
import br.com.thalisson.dagger.module.NetModule;

/**
 * Created by Team Fretebras Android on 11/10/16.
 */

public class App extends Application {
    NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent
                .builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://192.168.1.191/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
