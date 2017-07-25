package com.junk.application.fxtween;

import aurelienribon.tweenengine.TweenAccessor;
import javafx.scene.control.Slider;

/**
 * An Accessor of {@link javafx.scene.control.Slider}
 * @author Elmerhd
 */
public class SliderAccessor implements TweenAccessor<Slider>{
    public static final int VALUE = 0;
    @Override
    public int getValues(Slider target, int tweenType, float[] returnValues) {
        switch(tweenType){
            case VALUE:
                returnValues[0] = (float) target.getValue(); return 1;
            default:return -1;
        }
    }

    @Override
    public void setValues(Slider target, int tweenType, float[] newValues) {
        switch(tweenType){
            case VALUE:
                target.setValue(newValues[0]);break;
            default:break;
        }
    }

}
