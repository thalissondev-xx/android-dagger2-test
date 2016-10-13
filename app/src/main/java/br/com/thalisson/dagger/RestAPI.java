package br.com.thalisson.dagger;

import java.util.List;

import br.com.thalisson.dagger.domain.Frete;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Team Fretebras Android on 11/10/16.
 */

public interface RestAPI {
    @GET("/fretes")
    Call<List<Frete>> getFretes();
}
