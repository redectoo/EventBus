package com.tutorial.eventbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.w3c.dom.Text;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        EventBus.getDefault().register(this);



    }


    @Subscribe
    public void onEvent(MessageEvent event){
        Toast.makeText(TwoActivity.this, event.getMessage(), Toast.LENGTH_SHORT).show();
    }







}
