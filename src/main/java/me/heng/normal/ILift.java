package me.heng.normal;

/**
 * AUTHOR: wangdi
 * DATE: 12/07/2018
 * TIME: 5:51 PM
 */
public abstract class ILift {



    public enum LiftState{
        OPENING_STATE,CLOSING_STATE,RUNNING_STATE, STOPPING_STATE,
    }

    private LiftState liftState ;


    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
    }

    /**
     * 电梯门开启
     */
    public abstract void open();

    /**
     * 电梯门关闭
     */
    public abstract void close();

    /**
     * 电梯运行中
     */
    public abstract void running();

    /**
     * 电梯停止运行
     */
    public abstract void stop();
}
