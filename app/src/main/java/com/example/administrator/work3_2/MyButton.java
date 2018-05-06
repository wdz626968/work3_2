package com.example.administrator.work3_2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Button;

@SuppressLint("AppCompatCustomView")
public class MyButton extends Button {
    public MyButton(Context context , AttributeSet set){
        super(context , set);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode , event);
        Log.v("com.sise" , "the onKeyDown in MyButton");
        //返回true，表明该事件不会向外扩散
        return true;
    }
}
