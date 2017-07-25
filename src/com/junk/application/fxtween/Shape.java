package com.junk.application.fxtween;

import aurelienribon.tweenengine.TweenAccessor;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

/**
 * An Accessor of {@link javafx.scene.shape.Shape}
 * @author Elmerhd
 */
public class Shape {
    /**
    * An Accessor of {@link javafx.scene.shape.Rectangle}
    */
    public static class RectangleAccessor implements TweenAccessor<javafx.scene.shape.Rectangle>{
        public static final int FILL_RGBA = 0;
            
        @Override
        public int getValues(Rectangle target, int tweenType, float[] returnValues) {
            switch(tweenType){
                case FILL_RGBA:
                    Color color = (Color) target.getFill();
                    returnValues[0] = (float) color.getRed();
                    returnValues[1] = (float) color.getGreen();
                    returnValues[2] = (float) color.getBlue();
                    returnValues[3] = (float) color.getOpacity();
                    return 4;
                    default:assert false;return -1;
            }
        }

        @Override
        public void setValues(Rectangle target, int tweenType, float[] newValues) {
            switch(tweenType){
                case FILL_RGBA:
                    Color c = new Color(newValues[0], newValues[1], newValues[2], newValues[3]);
                    target.setFill(c);
                    break;
                    default:assert false;break;
            }
        }
        
    }
    /**
    * An Accessor of {@link javafx.scene.shape.Circle}
    */
    public static class CircleAccessor implements TweenAccessor<Circle>{
        public static final int POSITION_X = 0;
        public static final int POSITION_Y = 1;
        public static final int POSITION_Z = 2;
        public static final int COLOR_RGBA = 3;
        @Override
        public int getValues(Circle target, int tweenType, float[] returnValues) {
            switch(tweenType){
                case POSITION_X:
                    returnValues[0] = (float) target.getTranslateX();
                    return 1;
                case POSITION_Y:
                    returnValues[0] = (float) target.getTranslateY();
                    return 1;
                case POSITION_Z:
                    returnValues[0] = (float) target.getTranslateZ();
                    return 1;
                case COLOR_RGBA:
                    Color color = (Color) target.getFill();
                    returnValues[0] = (float) color.getRed();
                    returnValues[1] = (float) color.getGreen();
                    returnValues[2] = (float) color.getBlue();
                    returnValues[3] = (float) color.getOpacity();
                    return 4;
                    default:assert false;return -1;
            }
        }

        @Override
        public void setValues(Circle target, int tweenType, float[] newValues) {
            switch(tweenType){
                case POSITION_X:
                    target.setTranslateX(newValues[0]);
                    break;
                case POSITION_Y:
                    target.setTranslateY(newValues[0]);
                    break;
                case POSITION_Z:
                    target.setTranslateZ(newValues[0]);
                    break;
                case COLOR_RGBA:
                    Color c = new Color(newValues[0], newValues[2], newValues[3], newValues[4]);
                    target.setFill(c);
                    break;
                    default:assert false;break;
            }
        }
        
    }
    /**
    * An Accessor of {@link javafx.scene.shape.Polygon}
    */
    public static class PolygonAccessor implements TweenAccessor<Polygon> {
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
        public static final int XYWH = 15;
        @Override
        public int getValues(Polygon target, int tweenType, float[] returnValues) {
            switch(tweenType){
                case POSITION_X:
                    returnValues[0] = (float) target.getTranslateX();return 1;
                case POSITION_Y:
                    returnValues[0] = (float) target.getTranslateY();return 1;
                case POSITION_XY:
                    returnValues[0] = (float) target.getTranslateX();
                    returnValues[1] = (float) target.getTranslateY();return 2;
                case ROTATION:
                    returnValues[0] = (float) target.getRotate();return 1;
                case XYWH:
                    returnValues[0] = (float) target.getTranslateX();
                    returnValues[1] = (float) target.getTranslateY();
                    returnValues[2] = (float) target.getScaleX();
                    returnValues[3] = (float) target.getScaleY();return 4;
                default:assert false : "invalid tweenType";
                    return -1;
            }
        }

        @Override
        public void setValues(Polygon target, int tweenType, float[] newValues) {
            switch(tweenType){
                case POSITION_X:
                    target.setTranslateX(newValues[0]);break;
                case POSITION_Y:
                    target.setTranslateY(newValues[0]);break;
                case POSITION_XY:
                    target.setTranslateX(newValues[0]);
                    target.setTranslateY(newValues[1]);break;
                case ROTATION:
                    target.setRotate(newValues[0]);break;
                case XYWH:
                    target.setTranslateX(newValues[0]);
                    target.setTranslateY(newValues[1]);
                    target.setScaleX(newValues[2]);
                    target.setScaleY(newValues[3]);break;
                default:assert false : "invalid tweenType";
                    break;
            }
        }
        
    }
}
