package com.junk.application.fxtween;

import aurelienribon.tweenengine.TweenAccessor;
import javafx.scene.control.ProgressIndicator;

/**
 * An Accessor of {@link javafx.scene.control.ProgressBar}
 * @author Elmerhd
 */
public class ProgressBarAccessor implements TweenAccessor<ProgressIndicator>{
    public static final int VALUE = 0;
    public static final int OPACITY = 1;
    @Override
    public int getValues(ProgressIndicator target, int tweenType, float[] returnValues) {
        switch(tweenType){
            case VALUE:
                returnValues[0] = (float) target.getProgress();return 1;
            case OPACITY: returnValues[0] = (float) target.getOpacity();
                return 1;
                default:assert false;return -1;
        }
    }

    @Override
    public void setValues(ProgressIndicator target, int tweenType, float[] newValues) {
        switch(tweenType){
            case VALUE:
                target.setProgress(newValues[0]);break;
            case OPACITY:
                target.setOpacity(newValues[0]);break;
                default:assert false;break;
        }
    }

    
}
