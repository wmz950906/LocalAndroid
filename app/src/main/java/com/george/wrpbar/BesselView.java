package com.george.wrpbar;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class BesselView extends View {

    private Paint mPaint;
    private Path mPath;
    //一个波浪长，相当于两个二阶贝塞尔曲线的长度
    private int mItemWaveLength = 800;

    public int getOriginY() {
        return originY;
    }

    public void setOriginY(int originY) {
        this.originY = originY;
    }

    //波浪在Y轴方向的位置
    int originY = 400;

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    //波浪幅度
    private int range = 50;

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    private int dx;

    public int getMcolor() {
        return mcolor;
    }

    public void setMcolor(int mcolor) {
        this.mcolor = mcolor;
    }

    private int mcolor = Color.rgb(0, 191, 255);

    public Paint.Style getStyle() {
        return style;
    }

    public void setStyle(Paint.Style style) {
        this.style = style;
    }

    private Paint.Style style = Paint.Style.FILL_AND_STROKE;

    public BesselView(Context context) {
        super(context);

        init();
    }

    public BesselView(Context context, @androidx.annotation.Nullable AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    public BesselView(Context context, @androidx.annotation.Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    public BesselView(Context context, @androidx.annotation.Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init();
    }

    private int cnt = 0;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(mcolor);
        mPaint.setStyle(style);

        if (false) {
            if (cnt >= 10) {
                cnt = 0;
                mPath.reset();
            }
        } else
            mPath.reset();

        int halfWaveLen = mItemWaveLength / 2; //半个波长，即一个贝塞尔曲线长度
        mPath.moveTo(-mItemWaveLength + dx, originY);  //波浪的开始位置
        //每一次for循环添加一个波浪的长度到path中，根据view的宽度来计算一共可以添加多少个波浪长度
        for (int i = -mItemWaveLength; i <= getWidth() + mItemWaveLength; i += mItemWaveLength) {
            mPath.rQuadTo(halfWaveLen / 2, -range, halfWaveLen, 0);
            mPath.rQuadTo(halfWaveLen / 2, range, halfWaveLen, 0);
        }
        mPath.lineTo(getWidth(), getHeight());
        mPath.lineTo(0, getHeight());
        mPath.close(); //封闭path路径
        canvas.drawPath(mPath, mPaint);
    }

    public void startAnim() {
        //根据一个动画不断得到0~mItemWaveLength的值dx，通过dx的增加不断去改变波浪开始的位置，dx的变化范围刚好是一个波浪的长度，
        //所以可以形成一个完整的波浪动画，假如dx最大小于mItemWaveLength的话， 就会不会画出一个完整的波浪形状
        ValueAnimator animator = ValueAnimator.ofInt(0, mItemWaveLength);
        animator.setDuration(2000);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setInterpolator(new LinearInterpolator());
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                dx = (int) animation.getAnimatedValue();
                if (dx == mItemWaveLength) {
                    dx = 0;
                }
                cnt++;

                postInvalidate();//postInvalidate调用invalidat,invalidate方法会刷新整个View，并且当这个View的可见性为VISIBLE的时候，View的onDraw()方法将会被调用
            }
        });
        animator.start();
    }

    @SuppressLint("ResourceAsColor")
    private void init() {
        mPath = new Path();
        mPaint = new Paint();
        mPaint.setColor(mcolor);
        mPaint.setStyle(style);
    }
}
