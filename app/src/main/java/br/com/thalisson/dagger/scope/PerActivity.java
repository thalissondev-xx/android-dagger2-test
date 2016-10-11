package br.com.thalisson.dagger.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Team Fretebras Android on 10/10/16.
 */

@Scope
@Retention(RUNTIME)
public @interface PerActivity {

}