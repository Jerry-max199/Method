package com.zzjm.impl;

import com.zzjm.SayHello;

public class SayHelloImpl implements SayHello {
    @Override
    public void say(String Name) {
        System.out.println("你好"+Name);
    }
}
