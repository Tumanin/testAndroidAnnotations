package com.example.atumanin.testandroidannotations.ui;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.atumanin.testandroidannotations.rxBus;
import com.example.atumanin.testandroidannotations.R;
import com.squareup.otto.Subscribe;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.bus_event_button)
    protected TextView busEventButton;

    @Bean
    rxBus mBus;

    @AfterViews
    public void afterViews(){
        Log.d("MainActivity", "afterViews");
//        mBus.register(this);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms
                Log.d("MainActivity", "postDelayed");
//                mBus.post(new ExampleEvent());
            }
        }, 1000);

        busEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "busEventButton");
//                mBus.post(new ButtonEvent());
            }
        });
    }

    @Subscribe
    public void onButtonEvent(final ButtonEvent event){
        Log.d("TApplication", "onButtonEvent");
        Toast.makeText(this, "GOT ButtonEvent", Toast.LENGTH_LONG).show();
    }
}
