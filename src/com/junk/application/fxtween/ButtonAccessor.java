package com.junk.application.fxtween;

import aurelienribon.tweenengine.TweenAccessor;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * An Accessor of {@link javafx.scene.control.Button}
 * @author Elmerhd
 */
public class ButtonAccessor implements TweenAccessor<Button>{
    public static final int TEXTFILL_RGBA = 0;
    public static final int FONT_SIZE = 1;
    @Override
    public int getValues(Button target, int tweenType, float[] returnValues) {
        switch(tweenType){
            
            case TEXTFILL_RGBA:
                Color color = (Color) target.getTextFill();
                returnValues[0] = (float) color.getRed();
                returnValues[1] = (float) color.getGreen();
                returnValues[2] = (float) color.getBlue();
                returnValues[3] = (float) color.getOpacity();
                return 4;
            case FONT_SIZE:
                returnValues[0] = (float) target.getFont().getSize();
                return 1;
                default:assert false;return -1;
        }
    }

    @Override
    public void setValues(Button target, int tweenType, float[] newValues) {
        switch(tweenType){
                case TEXTFILL_RGBA:
                    Color c = new Color(newValues[0], newValues[1], newValues[2], newValues[3]);
                    target.setTextFill(c);
                    break;
                case FONT_SIZE:
                    Font font = new Font(target.getFont().getName(), newValues[0]);
                    target.setFont(font);
                    default:assert false;break;
            }
    }
    
}
