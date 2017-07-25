package com.junk.application.fxtween;

import aurelienribon.tweenengine.TweenAccessor;
import javafx.stage.Window;
/**
 * An Accessor of {@link javafx.stage.Window}
 * @author Elmerhd
 */
public class WindowAccessor implements TweenAccessor<Window> {
    

  public static final int POSITION_X = 1;
  public static final int POSITION_Y = 2;
  public static final int POSITION_XY = 3;
  public static final int OPACITY = 4;
  public static final int SCALE_W = 6;
  public static final int SCALE_H = 7;
  public static final int SCALE_WH = 8;
  public static final int POSCALE_WHXY = 9;
    @Override
    public int getValues(Window target, int tweenType, float[] returnValues) {
        switch (tweenType) {
            case OPACITY:returnValues[0] = (float) target.getOpacity();return 1;
            case POSITION_X: returnValues[0] = (float) target.getX();return 1;
            case POSITION_Y: returnValues[0] = (float) target.getY();return 1;
            case POSITION_XY: returnValues[0] = (float) target.getX();
                returnValues[1] = (float) target.getY();
                return 2;
            case SCALE_W: returnValues[0] = (float) target.getWidth();return 1;
            case SCALE_H: returnValues[0] = (float) target.getHeight();return 1;
            case SCALE_WH:
                returnValues[0] = (float) target.getWidth();
                returnValues[1] = (float) target.getHeight();
                return 2;
            case POSCALE_WHXY:
                returnValues[0] = (float) target.getWidth();
                returnValues[1] = (float) target.getHeight();
                returnValues[2] = (float) target.getX();
                returnValues[3] = (float) target.getY();
                return 4;
            default: assert false; return -1;
        }
    }
  
    @Override
    public void setValues(Window target, int tweenType, float[] newValues) {
        switch (tweenType) {
            case OPACITY: target.setOpacity(newValues[0]);break;
            case POSITION_X: target.setX(newValues[0]);break;
            case POSITION_Y: target.setY(newValues[0]);break;
            case POSITION_XY: target.setX(newValues[0]);
                target.setY(newValues[1]);
                break;
            case SCALE_W: target.setWidth(newValues[0]);break;
            case SCALE_H: target.setHeight(newValues[0]);break;
            case SCALE_WH:
                target.setWidth(newValues[0]);
                target.setHeight(newValues[1]);
                break;
            case POSCALE_WHXY:
                target.setWidth(newValues[0]);
                target.setHeight(newValues[1]);
                target.setX(newValues[2]);
                target.setY(newValues[3]);
                break;
        default: assert false; break;
        }
  }
}