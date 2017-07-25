package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawArc(50, 50, 130, 100, -110, 100, true, paint);//绘制扇形
            canvas.drawArc(50, 50, 130, 100, 20, 140, false, paint);//绘制弧形
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawArc(50, 50, 130, 100, -18, 60, false, paint);//绘制不封口的弧形
        } else {
            canvas.drawArc(new RectF(50, 50, 130, 100), -110, 100, true, paint);//绘制扇形
            canvas.drawArc(new RectF(50, 50, 130, 100), 20, 140, false, paint);//绘制弧形
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawArc(new RectF(50, 50, 130, 100), -180, 60, false, paint);//绘制不封口的弧形
        }

    }
}
