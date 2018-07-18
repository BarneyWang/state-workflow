package me.heng.pattern.impl;

import me.heng.pattern.Context;
import me.heng.pattern.LiftState;

/**
 * AUTHOR: wangdi
 * DATE: 18/07/2018
 * TIME: 4:53 PM
 */
public class StopLiftState extends LiftState{


    public void open() {
        System.out.println("lift is stop now,ca  opening");
        context.setLiftState(Context.openLiftState);
        context.getLiftState().open();
    }

    public void close() {
        System.out.println("life is stop now");
    }

    //stop状态可以跑
    public void run() {
        System.out.println("lift is running now,ca running");
        context.setLiftState(Context.runningLiftState);
        context.getLiftState().run();
    }

    public void stop() {
        System.out.println("life is stop now");
    }
}
