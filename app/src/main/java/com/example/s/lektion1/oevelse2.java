package com.example.s.lektion1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by S on 02-09-2014.
 */
public class oevelse2 extends Activity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState) {
        TextView tv, hej;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oevelse2);
        tv = (TextView) findViewById(R.id.textView);
        tv.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }
}