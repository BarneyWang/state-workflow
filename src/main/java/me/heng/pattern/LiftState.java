package me.heng.pattern;

/**
 * AUTHOR: wangdi
 * DATE: 18/07/2018
 * TIME: 4:51 PM
 */
public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
