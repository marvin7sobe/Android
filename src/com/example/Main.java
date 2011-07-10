package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity
{
    @Override
    public void onCreate(Bundle icicle)
    {
        super.onCreate(icicle);
        setContentView(R.layout.buttons);

    }
    public void back(View view){
        setContentView(R.layout.buttons);
    }

    public void setRelativeLayout(View view){
       setContentView(R.layout.relative);
    }
    public void setScrollLayout(View view){
       setContentView(R.layout.scroll);
    }
}
