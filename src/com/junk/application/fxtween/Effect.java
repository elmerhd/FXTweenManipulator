package com.junk.application.fxtween;

import aurelienribon.tweenengine.TweenAccessor;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.effect.MotionBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.effect.Shadow;
import javafx.scene.paint.Color;

/**
 * An Accessor of {@link javafx.scene.effect.Effect}
 * @author Elmerhd
 */
public class Effect {
    /**
     * An Accessor of {@link javafx.scene.effect.DropShadow}
     */
    public static class DropShadowAccessor implements TweenAccessor<DropShadow>{
        public static final int OFFSET_X = 0;
        public static final int OFFSET_Y = 1;
        public static final int OFFSET_XY = 2;
        public static final int WIDTH = 3;
        public static final int HEIGHT = 4;
        public static final int WH = 5;
        public static final int RADIUS = 6;
        public static final int SPREAD = 7;
        public static final int COLOR_RGBA = 8;
        @Override
        public int getValues(DropShadow target, int tweenType, float[] returnValues) {
            switch(tweenType){
                case OFFSET_X: returnValues[0] = (float) target.getOffsetX();return 1;
                case OFFSET_Y: returnValues[0] = (float) target.getOffsetY();return 1;
                case OFFSET_XY: returnValues[0] = (float) target.getOffsetX();
                    returnValues[1] = (float) target.getOffsetY();
                    return 2;
                case WIDTH: returnValues[0] = (float) target.getWidth();return 1;
                case HEIGHT: returnValues[0] = (float) target.getHeight();return 1;
                case WH: returnValues[0] = (float) target.getWidth();
                    returnValues[1] = (float) target.getHeight();
                    return 2;
                case RADIUS:returnValues[0] = (float) target.getRadius();return 1;
                case SPREAD:returnValues[0] = (float) target.getSpread();return 1;
                case COLOR_RGBA: returnValues[0] = (float) target.getColor().getRed();
                    returnValues[1] = (float) target.getColor().getGreen();
                    returnValues[2] = (float) target.getColor().getBlue();
                    returnValues[3] = (float) target.getColor().getOpacity();
                    return 4;
                        default:assert false;return -1;
            }
        }

        @Override
        public void setValues(DropShadow target, int tweenType, float[] newValues) {
            switch(tweenType){
                case OFFSET_X:target.setOffsetX(newValues[0]);break;
                case OFFSET_Y: target.setOffsetY(newValues[0]);break;
                case OFFSET_XY: target.setOffsetX(newValues[0]);
                    target.setOffsetY(newValues[1]);break;
                case WIDTH:target.setWidth(newValues[0]);break;
                case HEIGHT:target.setHeight(newValues[0]);break;
                case WH:target.setWidth(newValues[0]);
                    target.setHeight(newValues[1]);break;
                case SPREAD:target.setSpread(newValues[0]);break;
                case RADIUS:target.setRadius(newValues[0]);break;
                case COLOR_RGBA:
                    target.setColor(new Color(newValues[0], target.getColor().getGreen(), target.getColor().getGreen(),
                            target.getColor().getOpacity()));
                    target.setColor(new Color(target.getColor().getRed(), newValues[1], target.getColor().getBlue()
                            , target.getColor().getOpacity()));
                    target.setColor(new Color(target.getColor().getRed(), target.getColor().getGreen(), newValues[2],
                            target.getColor().getOpacity()));
                    target.setColor(new Color(target.getColor().getRed(), target.getColor().getGreen(), target.getColor().getBlue(),
                            newValues[3]));
                    break;
                    default:assert false;break;
            }
        }
    }
    /**
     * An Accessor of {@link javafx.scene.effect.Shadow}
     */
    public static class ShadowAccessor implements TweenAccessor<Shadow>{
        public static final int WIDTH = 3;
        public static final int HEIGHT = 4;
        public static final int WH = 5;
        public static final int RADIUS = 6;
        public static final int SPREAD = 7;
        public static final int COLOR_RGBA = 8;
        @Override
        public int getValues(Shadow target, int tweenType, float[] returnValues) {
            switch(tweenType){
                case WIDTH: returnValues[0] = (float) target.getWidth();return 1;
                case HEIGHT: returnValues[0] = (float) target.getHeight();return 1;
                case WH: returnValues[0] = (float) target.getWidth();
                    returnValues[1] = (float) target.getHeight();
                    return 2;
                case RADIUS:returnValues[0] = (float) target.getRadius();return 1;
                case COLOR_RGBA: returnValues[0] = (float) target.getColor().getRed();
                    returnValues[1] = (float) target.getColor().getGreen();
                    returnValues[2] = (float) target.getColor().getBlue();
                    returnValues[3] = (float) target.getColor().getOpacity();
                    return 4;
                        default:assert false;return -1;
            }
        }

        @Override
        public void setValues(Shadow target, int tweenType, float[] newValues) {
            switch(tweenType){
                case WIDTH:target.setWidth(newValues[0]);break;
                case HEIGHT:target.setHeight(newValues[0]);break;
                case WH:target.setWidth(newValues[0]);
                    target.setHeight(newValues[1]);break;
                case RADIUS:target.setRadius(newValues[0]);break;
                case COLOR_RGBA:
                    target.setColor(new Color(newValues[0], target.getColor().getGreen(), target.getColor().getGreen(),
                            target.getColor().getOpacity()));
                    target.setColor(new Color(target.getColor().getRed(), newValues[1], target.getColor().getBlue()
                            , target.getColor().getOpacity()));
                    target.setColor(new Color(target.getColor().getRed(), target.getColor().getGreen(), newValues[2],
                            target.getColor().getOpacity()));
                    target.setColor(new Color(target.getColor().getRed(), target.getColor().getGreen(), target.getColor().getBlue(),
                            newValues[3]));
                    break;
                    default:assert false;break;
            }
        }
    }
    /**
     * An Accessor of {@link javafx.scene.effect.Reflection}
     */
    public static class ReflectionAccessor implements TweenAccessor<Reflection>{
        public static final int BOTTOM_OPACITY = 0;
        public static final int FRACTION = 1;
        public static final int TOP_OFFSET = 2;
        public static final int TOP_OPACITY = 3;
        @Override
        public int getValues(Reflection target, int tweenType, float[] returnValues) {
            switch(tweenType){
                case BOTTOM_OPACITY: returnValues[0] = (float) target.getBottomOpacity();return 1;
                case FRACTION:returnValues[0] = (float) target.getFraction();return 1;
                case TOP_OFFSET: returnValues[0] = (float) target.getTopOffset();return 1;
                case TOP_OPACITY:returnValues[0] = (float) target.getTopOpacity();return 1;
                    default:assert false;return -1;
            }
        }

        @Override
        public void setValues(Reflection target, int tweenType, float[] newValues) {
            switch(tweenType){
                case BOTTOM_OPACITY: target.setBottomOpacity(newValues[0]);break;
                case FRACTION:target.setFraction(newValues[0]);break;
                case TOP_OFFSET:target.setTopOffset(newValues[0]);break;
                case TOP_OPACITY: target.getTopOpacity();break;
                    default:assert false;break;
            }
        }
    }
    /**
     * An Accessor of {@link javafx.scene.effect.Glow}
     */
    public static class GlowAccessor implements TweenAccessor<Glow>{
        public static final int LEVEL = 0;
        @Override
        public int getValues(Glow target, int tweenType, float[] returnValues) {
            switch(tweenType){
                case LEVEL: returnValues[0] = (float) target.getLevel();return 1;
                default:return -1;
            }
        }

        @Override
        public void setValues(Glow target, int tweenType, float[] newValues) {
            switch(tweenType){
                case LEVEL: target.setLevel(newValues[0]);break;
                default:break;
            }
        }
    }
    /**
     * An Accessor of {@link javafx.scene.effect.MotionBlur}
     */
    public static class MotionBlurAccessor implements TweenAccessor<MotionBlur>{
        public static final int ANGLE = 0;
        public static final int RADIUS = 1;
        @Override
        public int getValues(MotionBlur target, int tweenType, float[] returnValues) {
            switch(tweenType){
                case ANGLE: returnValues[0] = (float) target.getAngle();return 1;
                case RADIUS: returnValues[0] = (float) target.getRadius();return 1;
                default:return -1;
            }
        }

        @Override
        public void setValues(MotionBlur target, int tweenType, float[] newValues) {
            switch(tweenType){
                case ANGLE: target.setAngle(newValues[0]);break;
                case RADIUS: target.setRadius(newValues[0]);break;
                default:break;
            }
        }
    }
    /**
     * An Accessor of {@link javafx.scene.effect.ColorAdjust}
     */
    public static class ColorAdjustAccessor implements TweenAccessor<ColorAdjust>{
        public static final int BRIGHTNESS = 0;
        public static final int CONTRAST = 1;
        public static final int HUE = 2;
        public static final int SATURATION = 3;
        @Override
        public int getValues(ColorAdjust target, int tweenType, float[] returnValues) {
            switch(tweenType){
                case BRIGHTNESS: returnValues[0] = (float) target.getBrightness();return 1;
                case CONTRAST: returnValues[0] = (float) target.getContrast();return 1;
                case HUE: returnValues[0] = (float) target.getHue();return 1;
                case SATURATION: returnValues[0] = (float) target.getSaturation();return 1;
                default:return -1;
            }
        }

        @Override
        public void setValues(ColorAdjust target, int tweenType, float[] newValues) {
            switch(tweenType){
                case BRIGHTNESS: target.setBrightness(newValues[0]);break;
                case CONTRAST: target.setContrast(newValues[0]);break;
                case HUE: target.setHue(newValues[0]);break;
                case SATURATION: target.setSaturation(newValues[0]);break;
                default:break;
            }
        }
    }
    /**
     * An Accessor of {@link javafx.scene.effect.BoxBlur}
     */
    public static class BoxBlurAccessor implements TweenAccessor<BoxBlur>{
        public static final int WIDTH = 0;
        public static final int HEIGHT = 1;
        public static final int ITERATIONS = 2;
        @Override
        public int getValues(BoxBlur target, int tweenType, float[] returnValues) {
            switch(tweenType){
                case WIDTH: returnValues[0] = (float) target.getWidth();return 1;
                case HEIGHT: returnValues[0] = (float) target.getHeight();return 1;
                case ITERATIONS: returnValues[0] = (float) target.getIterations();return 1;
                default:return -1;
            }
        }

        @Override
        public void setValues(BoxBlur target, int tweenType, float[] newValues) {
            switch(tweenType){
                case WIDTH: target.setWidth(newValues[0]);break;
                case HEIGHT: target.setHeight(newValues[0]);break;
                case ITERATIONS: target.setIterations((int) newValues[0]);break;
                default:break;
            }
        }
    }
   
}
