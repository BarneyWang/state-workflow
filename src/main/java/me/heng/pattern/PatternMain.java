package me.heng.pattern;

/**
 * AUTHOR: wangdi
 * DATE: 18/07/2018
 * TIME: 5:09 PM
 */
public class PatternMain {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.closeLiftState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
