package com.bignerdranch.android.draganddraw.app;

import android.graphics.Paint;
import android.graphics.PointF;

public class Box {
    private PointF mOrigin;
    private PointF mCurrent;


    public Box(PointF origin, Paint mBoxPaint) {
        mOrigin = mCurrent = origin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF current, Paint mBoxPaint) {
        mCurrent = current;
    }

    public PointF getOrigin() {
        return mOrigin;
    }

}
