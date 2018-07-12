package me.heng.normal.impl;


import me.heng.normal.ILift;

import static me.heng.normal.ILift.LiftState.OPENING_STATE;

/**
 * AUTHOR: wangdi
 * DATE: 12/07/2018
 * TIME: 5:54 PM
 */
public class Lift extends ILift {



    /**
     * 电梯开启
     */
    @Override
    public void open() {

        switch (super.getLiftState()){
            case  CLOSING_STATE:
                this.setLiftState(OPENING_STATE);
                break;
            case OPENING_STATE:
                //do nothing
                return;
            case RUNNING_STATE:
                // do nothing
                return;
            case STOPPING_STATE:
                this.setLiftState(OPENING_STATE);
                return;
            default:
                return;
        }

    }

    /**
     * 电梯门关闭
     */
    @Override
    public void close() {
        switch (super.getLiftState()){
            case  CLOSING_STATE:
                //do nothing
                return;
            case OPENING_STATE:
                setLiftState(LiftState.CLOSING_STATE);
                return;
            case RUNNING_STATE:
                // do nothing
                return;
            case STOPPING_STATE:
                // do nothing
                return;
            default:
                return;
        }
    }

    /**
     * 电梯运行中
     */
    public void running() {
        switch (super.getLiftState()){
            case  CLOSING_STATE:
                setLiftState(LiftState.RUNNING_STATE);
                return;
            case OPENING_STATE:

                return;
            case RUNNING_STATE:
                // do nothing
                return;
            case STOPPING_STATE:
                // do nothing
                return;
            default:
                return;
        }
    }

    /**
     * 电梯关门
     */
    public void stop() {
        switch (super.getLiftState()){
            case  CLOSING_STATE:
                setLiftState(LiftState.STOPPING_STATE);
                return;
            case OPENING_STATE:
                return;
            case RUNNING_STATE:
                // do nothing
                return;
            case STOPPING_STATE:
                // do nothing
                return;
            default:
                return;
        }
    }
}
