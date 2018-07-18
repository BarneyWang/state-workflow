package me.heng.pattern;

import me.heng.pattern.impl.CloseLiftState;
import me.heng.pattern.impl.OpenLiftState;
import me.heng.pattern.impl.RunningLiftState;
import me.heng.pattern.impl.StopLiftState;

/**
 * AUTHOR: wangdi
 * DATE: 18/07/2018
 * TIME: 4:52 PM
 */
public class Context {

    public static CloseLiftState closeLiftState;
    public static OpenLiftState openLiftState;
    public static RunningLiftState runningLiftState;
    public static StopLiftState stopLiftState;

    public Context(){
        closeLiftState = new CloseLiftState();
        openLiftState = new OpenLiftState();
        runningLiftState = new RunningLiftState();
        stopLiftState = new StopLiftState();
    }

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        liftState.setContext(this);
    }


    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
