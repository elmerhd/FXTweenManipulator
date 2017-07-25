package com.junk.application.fxtween;

import aurelienribon.tweenengine.TweenAccessor;
import javafx.scene.control.ContextMenu;

/**
 * An Accessor of {@link javafx.scene.control.ContextMenu}
 * @author Elmerhd
 */
public class ContextMenuAccessor implements TweenAccessor<ContextMenu>{
    public static final int OPACITY = 0;
    @Override
    public int getValues(ContextMenu target, int tweenType, float[] returnValues) {
        switch(tweenType){
            case OPACITY:
                returnValues[0]=(float) target.getOpacity();return 1;
                default:assert false;return -1;
        }
    }

    @Override
    public void setValues(ContextMenu target, int tweenType, float[] newValues) {
        switch(tweenType){
            case OPACITY:
                target.setOpacity(newValues[0]);break;
                default:assert false;break;
        }
    }
    
}
