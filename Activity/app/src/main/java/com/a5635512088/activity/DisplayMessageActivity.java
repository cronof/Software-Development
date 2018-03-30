package com.a5635512088.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_message);

//        Bundle bundle = getIntent().getExtras();
        Bundle bundle = getIntent().getBundleExtra("bd");
        String message = bundle.getString("message");
        message += bundle.getBoolean("isTrue", true);
        message +=  bundle.getInt("value",0);

        MyData md = getIntent().getParcelableExtra("MyData");
        System.out.println("x = " + md.x + "\n y = " + md.y );

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
© 2018 GitHub, Inc.