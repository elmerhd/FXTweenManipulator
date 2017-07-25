/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junk.application.fxtween;

import aurelienribon.tweenengine.TweenAccessor;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

/**
 * An Accessor of {@link javafx.scene.control.TextField}
 * @author Elmerhd
 */
public class TextFieldAccessor implements TweenAccessor<TextField>{
    public static final int FONT_SIZE = 1;
    @Override
    public int getValues(TextField target, int tweenType, float[] returnValues) {
        switch(tweenType){
            case FONT_SIZE:
                returnValues[0] = (float) target.getFont().getSize();
                return 1;
                default:assert false;return -1;
        }
    }

    @Override
    public void setValues(TextField target, int tweenType, float[] newValues) {
        switch(tweenType){
                case FONT_SIZE:
                    Font font = new Font(target.getFont().getName(), newValues[0]);
                    target.setFont(font);
                    default:assert false;break;
            }
    }
    
}
