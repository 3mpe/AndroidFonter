package com.example.a3mpe.fonter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class CustomFontTextView extends android.support.v7.widget.AppCompatTextView {

    private String delimiter;

    public CustomFontTextView(Context context) {
        super(context);
    }

    public CustomFontTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }


    public CustomFontTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomFontTextView);
        final int N = a.getIndexCount();

        for (int i = 0; i < N; ++i) {
            int attr = a.getIndex(i);
            if (attr == R.styleable.CustomFontTextView_fontName) {
                delimiter = a.getString(attr);
                setFont(context, attrs, delimiter);

            }
        }
        a.recycle();
    }

    private void setFont(Context context, AttributeSet attrs, String delimiter) {
        if (attrs != null) {
            Typeface tf = Typeface.createFromAsset(context.getAssets(), "fonts/" + delimiter);
            setTypeface(tf);

        }
    }
}
