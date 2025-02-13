package com.yuexian.behaviorpatterns.observer.demo3;

import java.util.EventObject;

/**
 * @author yuexian
 * @description 铃声事件类：用于封装事件源及一些与事件相关的参数
 * @date 2021.4.16 14:13
 */
public class RingEvent extends EventObject {

    private static final long serialVersionUID = 1L;
    private boolean sound;    //true表示上课铃声,false表示下课铃声

    public RingEvent(Object source, boolean sound) {
        super(source);
        this.sound = sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }

    public boolean getSound() {
        return this.sound;
    }
}
