package me.heng.pattern.impl;

import me.heng.pattern.Context;
import me.heng.pattern.LiftState;

/**
 * AUTHOR: wangdi
 * DATE: 18/07/2018
 * TIME: 4:53 PM
 */
public class CloseLiftState extends LiftState{


    public void open() {
        System.out.println("state is close ,now is open");
        //目前状态从 open -> close
        context.setLiftState(Context.openLiftState);
        context.getLiftState().open();
    }

    public void close() {
        System.out.println("lift is close now");
    }

    public void run() {
        System.out.println("state is close ,now is running");
        context.setLiftState(Context.runningLiftState);
        context.getLiftState().run();
    }

    public void stop() {
        System.out.println("state is close ,now is stop");
        context.setLiftState(Context.stopLiftState);
        context.getLiftState().stop();
    }
}
