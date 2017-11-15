package com.example.atumanin.testandroidannotations;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.example.atumanin.testandroidannotations.ui.ExampleEvent;
import com.squareup.otto.Subscribe;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EApplication;



@EApplication
public class TApplication extends Application {

    @Bean
    rxBus mBus;

    @Override
    public void onCreate() {

//        mBus.register(this);
        Log.d("TApplication", "mBus.register");
        super.onCreate();
    }

    @Subscribe
    public void onExampleEvent(final ExampleEvent event){
        Log.d("TApplication", "onExampleEvent");
        Toast.makeText(this, "GOT ExampleEvent", Toast.LENGTH_LONG).show();
    }
}
