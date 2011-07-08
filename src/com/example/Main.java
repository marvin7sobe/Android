package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;


import java.awt.*;
import java.util.Date;

public class Main extends Activity implements CompoundButton.OnCheckedChangeListener
{
    Button btn;
    CheckBox chb;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle)
    {
        super.onCreate(icicle);
        setContentView(R.layout.main);
        btn = new Button(this);
        chb = (CheckBox)findViewById(R.id.checkbox);
        chb.setOnCheckedChangeListener(this);


        EditText field = (EditText)findViewById(R.id.field);
        field.setText("This text was set from the main activity" +
                "\"Licence\" used of apache");
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if(isChecked)
            chb.setText("This checkbox is:checked");
        else
            chb.setText("This checkbox is:unchecked");
    }
}
