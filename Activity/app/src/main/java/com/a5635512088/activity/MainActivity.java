package com.a5635512088.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnClick;
    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = findViewById(R.id.tvMain);

        btnClick = findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        DisplayMessageActivity.class );
//                intent.putExtra("message", tvMain.getText() );
//                intent.putExtra("isTrue", true);
//                intent.putExtra("value", 5);

                Bundle bd = new Bundle();
                bd.putString("message", tvMain.getText().toString() );
                bd.putBoolean("isTrue", true);
                bd.putInt("value",1);
                intent.putExtra("MyData", new MyData());
                intent.putExtra("bd",bd);
                startActivity(intent);
            }
        });
    }
}
