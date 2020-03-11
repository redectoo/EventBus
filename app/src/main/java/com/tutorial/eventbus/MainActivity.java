package com.tutorial.eventbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class MainActivity extends AppCompatActivity {
    private MyCustomEvent customEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
        EventBus.getDefault().post(new MessageEvent("New message!"));

        Intent intent = new Intent(this, TwoActivity.class);
       // startActivity(intent);


    }



    @Subscribe
    public void onEvent(MessageEvent event){
        Toast.makeText(MainActivity.this, event.getMessage(), Toast.LENGTH_SHORT).show();
    }



    public void onStop() {
        super.onStop();
      //  EventBus.getDefault().unregister(this);




    }

    /*
   Method will act as the event handler for MyCustomEvent
   */

}
