package com.mlh.zenyo.minidj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.bPlay1);
        b1.setOnClickListener(handlerPlay1);
    }
    View.OnClickListener handlerPlay1 = new View.OnClickListener() {
        public void onClick(View v) {
            // TCP Connector Play
        }
    };
}
