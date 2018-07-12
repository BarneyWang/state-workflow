package me.heng.normal;


import me.heng.normal.impl.Lift;

/**
 * AUTHOR: wangdi
 * DATE: 12/07/2018
 * TIME: 6:06 PM
 */
public class LiftTest {

    public static void main(String[] args) {
        ILift iLift = new Lift();
        iLift.setLiftState(ILift.LiftState.OPENING_STATE);
        iLift.open();
        iLift.close();
        iLift.running();
        iLift.stop();

    }
}
