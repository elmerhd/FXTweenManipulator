
package com.junk.application.fxtween;

/**
 * A task worker can be use as task manipulator in javafx. 
 * A task worker can fire events on start on progress and end
 * basically in the timeline you cant manipulate void method so I did this. :)
 * @author Elmerhd
 * 
 */
public abstract class TaskWorker {
    private  int progress = 0;
    private final float elapseValue = 100;
    private float currentValue = 0;
    public TaskWorker() {
    }
    /**
     * Gets the current value
     * @return the current value
     */
    public float getCurrentValue() {
        return currentValue;
    }
    /**
     * Gets the elapse value
     * @return the elapse value
     */
    public float getElapseValue() {
        return elapseValue;
    }
    /**
     * sets the current value   
     * @param currentValue the current value
     */
    public void setCurrentValue(float currentValue) {
        this.currentValue = currentValue;
    }
    /**
     * Gets the progress
     * @return the progress
     */
    public int getProgress() {
        float progres = (currentValue/elapseValue) / 0.01f;
        progress = Math.round(progres);
        return progress;
    }
    /**
     * the task which triggers on progress
     * it must get the get progress to trigger the action
     */
    public abstract void onProgress();
    /**
     * the task which triggers on start
     */
    public abstract void onStart();
    /**
     * the task which triggers on end
     */
    public abstract void onEnd();

}
