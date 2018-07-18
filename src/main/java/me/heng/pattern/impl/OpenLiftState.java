package me.heng.pattern.impl;

import me.heng.pattern.Context;
import me.heng.pattern.LiftState;

/**
 * AUTHOR: wangdi
 * DATE: 18/07/2018
 * TIME: 4:53 PM
 */
public class OpenLiftState extends LiftState{


    /**
     *
     */
    public void open() {
        System.out.println("lif is open now");
    }

    public void close() {
        System.out.println("state is open ,now is closing");
        context.setLiftState(Context.closeLiftState);
        context.getLiftState().close();
    }

    public void run() {

    }

    public void stop() {

    }
}
