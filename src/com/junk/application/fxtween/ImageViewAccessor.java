package com.junk.application.fxtween;

import aurelienribon.tweenengine.TweenAccessor;
import javafx.geometry.Point3D;
import javafx.scene.image.ImageView;
/**
 * An Accessor of {@link javafx.scene.image.ImageView}
 * @author Elmerhd
 */
public class ImageViewAccessor implements TweenAccessor<ImageView> {
    

  public static final int POSITION_X = 1;
  public static final int POSITION_Y = 2;
  public static final int POSITION_XY = 3;
  public static final int OPACITY = 4;
  public static final int ROTATION = 5;
  public static final int SCALE_W = 6;
  public static final int SCALE_H = 7;
  public static final int SCALE_WH = 8;
  public static final int POSCALE_WHXY = 9;
  public static final int ROTATION_VALUE_XYZ = 10;
  
  

  // TweenAccessor implementation

    @Override
    public int getValues(ImageView target, int tweenType, float[] returnValues) {
        switch (tweenType) {
            case POSITION_X: returnValues[0] = (float) target.getTranslateX(); return 1;
            case POSITION_Y: returnValues[0] = (float) target.getTranslateY(); return 1;
            case POSITION_XY:
                returnValues[0] = (float) target.getTranslateX();
                returnValues[1] = (float) target.getTranslateY();
                return 2;
            case OPACITY:returnValues[0] = (float) target.getOpacity();return 1;
            case ROTATION: returnValues[0] = (float) target.getRotate();return 1;
            case SCALE_W: returnValues[0] = (float) target.getScaleX();return 1;
            case SCALE_H: returnValues[0] = (float) target.getScaleY();return 1;
            case SCALE_WH:
                returnValues[0] = (float) target.getScaleX();
                returnValues[1] = (float) target.getScaleY();
                return 2;
            case POSCALE_WHXY:
                returnValues[0] = (float) target.getScaleX();
                returnValues[1] = (float) target.getScaleY();
                returnValues[2] = (float) target.getTranslateX();
                returnValues[3] = (float) target.getTranslateY();
                return 4;
            case ROTATION_VALUE_XYZ:
                returnValues[0] = (float) target.getRotationAxis().getX();
                returnValues[1] = (float) target.getRotationAxis().getY();
                returnValues[2] = (float) target.getRotationAxis().getZ();
                return 3;
            default: assert false; return -1;
        }
    }
  
    @Override
    public void setValues(ImageView target, int tweenType, float[] newValues) {
        switch (tweenType) {
        case POSITION_X: target.setTranslateX(newValues[0]); break;
        case POSITION_Y: target.setTranslateY(newValues[0]); break;
        case POSITION_XY:
            target.setTranslateX(newValues[0]);
            target.setTranslateY(newValues[1]);
            break;
        case OPACITY: target.setOpacity(newValues[0]);break;
        case ROTATION: target.setRotate(newValues[0]);break;
        case SCALE_W: target.setScaleX(newValues[0]);break;
        case SCALE_H: target.setScaleY(newValues[0]);break;
        case SCALE_WH:
            target.setScaleX(newValues[0]);
            target.setScaleY(newValues[1]);
            break;
        case POSCALE_WHXY:
            target.setScaleX(newValues[0]);
            target.setScaleY(newValues[1]);
            target.setTranslateX(newValues[2]);
            target.setTranslateY(newValues[3]);
            break;
        case ROTATION_VALUE_XYZ:target.setRotationAxis(new Point3D(newValues[0], newValues[1], newValues[2]));break;
        default: assert false; break;
        }
  }
}