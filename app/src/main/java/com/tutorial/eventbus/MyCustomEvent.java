package com.tutorial.eventbus;

import org.greenrobot.eventbus.EventBus;

public class MyCustomEvent{
    String data;
    public MyCustomEvent(String data){
        this.data=data;

    }
}