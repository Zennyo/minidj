package com.mlh.zenyo.minidj;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bplay1;
    private Button bplay2;
    private Button bstop1;
    private Button bstop2;
    private Button bpause1;
    private Button bpause2;

    TextView Test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bplay1 = (Button) findViewById(R.id.bPlay1);
        bplay1.setOnClickListener(handlerPlay1);
        bplay2 = (Button) findViewById(R.id.bPlay2);
        bplay2.setOnClickListener(handlerPlay2);

        bstop1 = (Button) findViewById(R.id.bStop1);
        bstop1.setOnClickListener(handlerStop1);
        bstop2 = (Button) findViewById(R.id.bStop2);
        bstop2.setOnClickListener(handlerStop2);

        bpause1 = (Button) findViewById(R.id.bPause1);
        bpause1.setOnClickListener(handlerPause1);
        bpause2 = (Button) findViewById(R.id.bPause2);
        bpause2.setOnClickListener(handlerPause2);

    }
    View.OnClickListener handlerPlay1 = new View.OnClickListener() {
        public void onClick(View v) {
            // TCP Connector Play
            Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerPlay2 = new View.OnClickListener() {
        public void onClick(View v) {
            // TCP Connector Play
            Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerStop1 = new View.OnClickListener() {
        public void onClick(View v) {
            // TCP Connector
            Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerStop2 = new View.OnClickListener() {
        public void onClick(View v) {
            // TCP Connector Play
            Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerPause1 = new View.OnClickListener() {
        public void onClick(View v) {
            // TCP Connector
            Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerPause2 = new View.OnClickListener() {
        public void onClick(View v) {
            // TCP Connector Play
            Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
        }
    };
}
