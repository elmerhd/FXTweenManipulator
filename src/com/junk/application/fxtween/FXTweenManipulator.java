
package com.junk.application.fxtween;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenAccessor;
import aurelienribon.tweenengine.TweenManager;
import javafx.application.Platform;

/**
 * A tween manipulator manipulates every tween on javafx application(s) 
 * whats inside?
 * well actually a thread that updates {@link aurelienribon.tweenengine.TweenManager}
 * in every seconds of time.
 * @author Elmerhd
 * 
 */
public class FXTweenManipulator {
    private TweenManager tweenManager;
    private boolean running = false;
    /**
     * Register all the attributes of the javafx components.
     * @param clasz the class to register.
     * @param tweenAccessor the accessor of the class to register.
     * @param tm the tweenmanager.
     * 
     */
    public void registerClassAccessors(Class<?>clasz,TweenAccessor<?> tweenAccessor,TweenManager tm) {
        Tween.registerAccessor(clasz, tweenAccessor);
        tweenManager = tm;
    }
    /**
     * Sets the attrib limits if you have a combination of XYWH just set 4
     * @param attribLimits the attribute limits.
     */
    public void setCombineAttrLimits(int attribLimits){
        Tween.setCombinedAttributesLimit(attribLimits);
    }
    /**
     * Starts the thread.
     */
    public void start(){
        running = true;
        Runnable runnable = () -> {
            long lastMillis = System.currentTimeMillis();
            long deltaLastMillis = System.currentTimeMillis();

            while (running) {
                long newMillis = System.currentTimeMillis();
                long sleep = 15 - (newMillis - lastMillis);
                lastMillis = newMillis;

                if (sleep > 1)
                    try {Thread.sleep(sleep);} catch (InterruptedException ex) {}

                long deltaNewMillis = System.currentTimeMillis();
                final float delta = (deltaNewMillis - deltaLastMillis) / 1000f;

                Platform.runLater(() -> {
                    tweenManager.update(delta);
                });

                deltaLastMillis = newMillis;
            }
        };

        new Thread(runnable).start();
    }
    /**
    * Stops the thread
    */
    public void stop() {
        running = false;
    }
    /**
    * Returns if the thread is running.
    * @return true if running else if not.
    */
    public boolean isRunning(){
        return running;
    }
}
