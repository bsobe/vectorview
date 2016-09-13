package com.bsobe.vectorview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatDrawableManager;
import android.util.AttributeSet;

public class VectorButton extends AppCompatButton {

    public VectorButton(Context context) {
        super(context);
        init(null);
    }

    public VectorButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public VectorButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray attributes = getContext().obtainStyledAttributes(attrs, R.styleable.VectorView);
            int drawableLeftResourceId = attributes.getResourceId(R.styleable.VectorView_drawableLeft, 0);
            int drawableTopResourceId = attributes.getResourceId(R.styleable.VectorView_drawableTop, 0);
            int drawableRightResourceId = attributes.getResourceId(R.styleable.VectorView_drawableRight, 0);
            int drawableBottomResourceId = attributes.getResourceId(R.styleable.VectorView_drawableBottom, 0);
            int drawableTintColor = attributes.getColor(R.styleable.VectorView_drawableTint, -1);
            attributes.recycle();

            Drawable[] drawables = new Drawable[4];
            if (drawableLeftResourceId != 0) {
                drawables[0] = getDrawable(drawableLeftResourceId);
                setTint(drawables[0], drawableTintColor);
            }
            if (drawableTopResourceId != 0) {
                drawables[1] = getDrawable(drawableTopResourceId);
                setTint(drawables[1], drawableTintColor);
            }
            if (drawableRightResourceId != 0) {
                drawables[2] = getDrawable(drawableRightResourceId);
                setTint(drawables[2], drawableTintColor);
            }
            if (drawableBottomResourceId != 0) {
                drawables[3] = getDrawable(drawableBottomResourceId);
                setTint(drawables[3], drawableTintColor);
            }
            if (drawables[0] != null || drawables[1] != null || drawables[2] != null || drawables[3] != null) {
                setCompoundDrawablesWithIntrinsicBounds(drawables[0], drawables[1], drawables[2], drawables[3]);
            }
        }
    }

    private Drawable getDrawable(@DrawableRes int drawableResId) {
        return DrawableCompat.wrap(AppCompatDrawableManager.get().getDrawable(getContext(), drawableResId)).mutate();
    }

    private void setTint(Drawable drawable, @ColorInt int color) {
        if (color != -1) {
            DrawableCompat.setTint(drawable, color);
        }
    }
}
