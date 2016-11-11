package br.com.thalisson.dagger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * Created by Team Fretebras Android on 11/10/16.
 */

public class Main extends AppCompatActivity {
    @Inject
    Retrofit retrofit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //((App) getApplication()).getNetComponent().inject(this);
    }
}
