package com.atguigu.hdct;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;

public class MyScrollow extends ScrollView {
    private float lastx;
    private float lasty;
    public ListView listView;
    private int left;
    private int top;
    private int right;
    private int bottom;
    private boolean isNoIntercept = false;

    public MyScrollow(Context context) {
        super(context);
    }

    public MyScrollow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void Setlistview(ListView listView) {
        this.listView = listView;
        if (listView == null) {
            top = 0;
            left = 0;
            right = 0;
            bottom = 0;
        } else {
            top = listView.getTop();
            bottom = listView.getBottom();
            left = listView.getLeft();
            right = +listView.getRight();
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
//
        Log.i("111", " "+ev.getAction());
        //Log.i("ddd---------", listView.getFirstVisiblePosition() + "");
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.i("111","dddddd");
        return super.onTouchEvent(ev);
    }
}
