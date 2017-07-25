

package com.junk.application.fxtween;

import aurelienribon.tweenengine.TweenAccessor;

/**
 * An Accessor of {@link com.junk.application.fxtween.TaskWorker}
 * @author Elmerhd
 */
public class TaskWorkerAccessor implements TweenAccessor<TaskWorker>{
    public static final int VALUE = 0;
    @Override
    public int getValues(TaskWorker target, int tweenType, float[] returnValues) {
        switch(tweenType){
            case VALUE:
                returnValues[0] = target.getProgress();
                return 1;
                default:return -1;
        }
    }

    @Override
    public void setValues(TaskWorker target, int tweenType, float[] newValues) {
        switch(tweenType){
            case VALUE:
                
                target.setCurrentValue(newValues[0]);
                
                if(target.getCurrentValue() == 0){
                    target.onStart();
                }else if (target.getCurrentValue() == target.getElapseValue()){
                    target.onEnd();
                }else{
                    target.onProgress();
                }
                break;
                default:break;
        }
    }

}
