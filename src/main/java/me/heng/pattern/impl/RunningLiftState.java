package me.heng.pattern.impl;

import me.heng.pattern.Context;
import me.heng.pattern.LiftState;

/**
 * AUTHOR: wangdi
 * DATE: 18/07/2018
 * TIME: 4:53 PM
 */
public class RunningLiftState extends LiftState{


    public void open() {
        System.out.println("lif is running now");
    }

    public void close() {
        System.out.println("lif is running now");
    }

    public void run() {
        System.out.println("lif is running now");
    }

    public void stop() {
        System.out.println("lift is running now,ca stop");
        context.setLiftState(Context.stopLiftState);
        context.getLiftState().stop();
    }
}
