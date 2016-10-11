package br.com.thalisson.dagger;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import br.com.thalisson.dagger.contract.AirplaneComponent;
import br.com.thalisson.dagger.contract.ApplicationComponent;
import br.com.thalisson.dagger.contract.CarComponent;
import br.com.thalisson.dagger.contract.DaggerAirplaneComponent;
import br.com.thalisson.dagger.contract.DaggerCarComponent;
import br.com.thalisson.dagger.domain.Airplane;
import br.com.thalisson.dagger.domain.Car;
import br.com.thalisson.dagger.module.AirplaneModule;
import br.com.thalisson.dagger.module.CarModule;
import butterknife.Bind;

public class MainActivity extends AppCompatActivity {

    private CarComponent mCarComponent;
    private AirplaneComponent mAirplaneComponent;

    private Car mCar;
    private Airplane mAirplane;
    private SharedPreferences mSharePreferences;

    @Bind(R.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv.setText("Thalisson Estrela Lopes");

        mCarComponent = DaggerCarComponent
                .builder()
                .applicationComponent(getApplicationComponent())
                .carModule(new CarModule())
                .build();

        mCar = mCarComponent.provideCar();
        mCarComponent.inject(mCar);

        mCar.increaseSpeed(120);
        Toast.makeText(this, "Car: " + mCar.getSpeed(), Toast.LENGTH_SHORT).show();

        mCar.turnLeft();
        Toast.makeText(this, "Direction: " + mCar.getDirection(), Toast.LENGTH_SHORT).show();

        mSharePreferences = mCarComponent.providePreferences();
        mSharePreferences.edit().putInt(Car.SPEED, mCar.getSpeed()).apply();
        Toast.makeText(this, "SharedPreferences: " + mSharePreferences.getInt(Car.SPEED, 0), Toast.LENGTH_LONG).show();

        // Airplane
        mAirplaneComponent = DaggerAirplaneComponent
                .builder()
                .airplaneModule(new AirplaneModule())
                .build();

        mAirplane = mAirplaneComponent.provideAirplane();
        mAirplaneComponent.inject(mAirplane);

        mAirplane.setAutomatic();

        Toast.makeText(this, "Airplane LandingGear: " + mAirplane.getLandingGear(), Toast.LENGTH_SHORT).show();
    }

    private ApplicationComponent getApplicationComponent(){
        return( ((AndroidApplication) getApplication()).getApplicationComponent() );
    }
}