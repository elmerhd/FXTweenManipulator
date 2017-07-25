package com.junk.application.fxtween;

import aurelienribon.tweenengine.TweenAccessor;
import javafx.geometry.Point3D;
import javafx.scene.control.Control;
/**
 * An Accessor of {@link javafx.scene.control.Control}
 * @author Elmerhd
 */
public class ControlAccessor implements TweenAccessor<Control> {
    

  public static final int POSITION_X = 1;
  public static final int POSITION_Y = 2;
  public static final int POSITION_XY = 3;
  public static final int OPACITY = 4;
  public static final int ROTATION_VALUE_XYZ = 5;
  public static final int ROTATION = 6;
  public static final int SCALE_X = 7;
  public static final int SCALE_Y = 8;
  public static final int SCALE_XY = 9;
  public static final int WIDTH = 10;
  public static final int HEIGHT = 11;
  public static final int WH = 12;
  public static final int COLOR = 13;
  public static final int VISIBILITY = 14;
  public static final int ENABILITY = 15;
  
  
  
  

  // TweenAccessor implementation

    @Override
    public int getValues(Control target, int tweenType, float[] returnValues) {
        switch (tweenType) {
            case POSITION_X: returnValues[0] = (float) target.getLayoutX(); return 1;
            case POSITION_Y: returnValues[0] = (float) target.getLayoutY(); return 1;
            case POSITION_XY:
                returnValues[0] = (float) target.getLayoutX();
                returnValues[1] = (float) target.getLayoutY();
                return 2;
            case OPACITY:returnValues[0] = (float) target.getOpacity();return 1;
            case ROTATION_VALUE_XYZ:
                returnValues[0] = (float) target.getRotationAxis().getX();
                returnValues[1] = (float) target.getRotationAxis().getY();
                returnValues[2] = (float) target.getRotationAxis().getZ();
                return 3;
            case ROTATION: returnValues[0] = (float) target.getRotate();return 1;
            case SCALE_X: returnValues[0] = (float) target.getScaleX();return 1;
            case SCALE_Y: returnValues[0] = (float) target.getScaleY();return 1;
            case SCALE_XY:
                returnValues[0] = (float) target.getScaleX();
                returnValues[1] = (float) target.getScaleY();
                return 2;
            case WIDTH:
                 returnValues[0] = (float) target.getPrefWidth();return 1;
            case HEIGHT:
                returnValues[0] = (float) target.getPrefHeight(); return 1;
            case WH:
                returnValues[0] = (float) target.getPrefWidth();
                returnValues[1] = (float) target.getPrefHeight();
                return 2;
            case VISIBILITY:
                returnValues[0] = (float) target.getOpacity();
                return 1;                
            default: assert false; return -1;
        }
    }
  
    @Override
    public void setValues(Control target, int tweenType, float[] newValues) {
        switch (tweenType) {
        case POSITION_X: target.setLayoutX(newValues[0]); break;
        case POSITION_Y: target.setLayoutY(newValues[0]); break;
        case POSITION_XY:
            target.setLayoutX(newValues[0]);
            target.setLayoutY(newValues[1]);
            break;
        case OPACITY: target.setOpacity(newValues[0]);break;
        case ROTATION_VALUE_XYZ:target.setRotationAxis(new Point3D(newValues[0], newValues[1], newValues[2]));break;
        case ROTATION:target.setRotate(newValues[0]);break;
        case SCALE_X: target.setScaleX(newValues[0]);break;
        case SCALE_Y: target.setScaleY(newValues[0]);break;
        case SCALE_XY:
            target.setScaleX(newValues[0]);
            target.setScaleY(newValues[1]);
            break;
        case WIDTH: target.setPrefWidth(newValues[0]);break;
        case HEIGHT: target.setPrefHeight(newValues[0]);break;
        case WH: target.setPrefSize(newValues[0], newValues[1]);break;
        case VISIBILITY:
            target.setOpacity(newValues[0]);
            if(newValues[0] == 0){
                target.setVisible(false);
            }else{
                target.setVisible(true);
            }
        default: assert false; break;
        }
  }
}