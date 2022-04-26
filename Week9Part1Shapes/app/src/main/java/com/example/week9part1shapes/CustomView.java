package com.example.week9part1shapes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {

    private static final int SQUARE_SIZE = 300;

    private Rect rectSquare;
    private Paint paintSquare;

    public CustomView(Context context) {
        super(context);

        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(attrs);
    }

    private void init(@Nullable AttributeSet set) {
        rectSquare = new Rect();
        paintSquare = new Paint();

        paintSquare.setColor(Color.GREEN);
    }

    public void swapColor() {
        paintSquare.setColor(paintSquare.getColor() == Color.GREEN ? Color.RED : Color.GREEN);
        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // canvas.drawColor(Color.RED);

        rectSquare.left = 50;
        rectSquare.top = 50;
        rectSquare.right = rectSquare.left + SQUARE_SIZE;
        rectSquare.bottom = rectSquare.top + SQUARE_SIZE;

        canvas.drawRect(rectSquare, paintSquare);

        Paint paint = new Paint();

        paint.setStrokeWidth(8);
        paint.setColor(Color.BLUE);
        paint.setTextSize(50);

        canvas.drawLine(0, 0, 200, 200, paint);

        canvas.drawCircle(400, 400, 100, paint);

        canvas.drawText("Some text", 500, 250, paint);
    }
}
