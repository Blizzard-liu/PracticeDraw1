package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(20,0);
        path.rLineTo(0,100);
        path.rLineTo(100,0);
        paint.setColor(Color.WHITE);
        canvas.drawPath(path,paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        canvas.drawRect(new RectF(30,90,40,100),paint);
        paint.setColor(Color.WHITE);
        canvas.drawText("A",30,110,paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(new RectF(50,60,60,100),paint);
        paint.setColor(Color.WHITE);
        canvas.drawText("B",50,110,paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(new RectF(70,10,80,100),paint);
        paint.setColor(Color.WHITE);
        canvas.drawText("C",70,110,paint);
    }
}
