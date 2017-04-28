package com.example.a3mpe.fonter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class CustomCheckBox extends android.support.v7.widget.AppCompatCheckBox {
    private String delimiter;
    public CustomCheckBox(Context context) {
        super(context);
    }

    public CustomCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CustomCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
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