package com.mlh.zenyo.minidj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton bplay1;
    private ImageButton bplay2;
    private ImageButton bstop1;
    private ImageButton bstop2;
    private ImageButton bpause1;
    private ImageButton bpause2;
    private Button bf1;
    private Button bf2;
    private Button bf3;
    private Button bf4;
    private Button bf5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bplay1 = (ImageButton) findViewById(R.id.bPlay1);
        bplay1.setOnClickListener(handlerPlay1);
        bplay2 = (ImageButton) findViewById(R.id.bPlay2);
        bplay2.setOnClickListener(handlerPlay2);

        bstop1 = (ImageButton) findViewById(R.id.bStop1);
        bstop1.setOnClickListener(handlerStop1);
        bstop2 = (ImageButton) findViewById(R.id.bStop2);
        bstop2.setOnClickListener(handlerStop2);

        bpause1 = (ImageButton) findViewById(R.id.bPause1);
        bpause1.setOnClickListener(handlerPause1);
        bpause2 = (ImageButton) findViewById(R.id.bPause2);
        bpause2.setOnClickListener(handlerPause2);

        bf1 = (Button) findViewById(R.id.bf1);
        bf1.setOnClickListener(handlerF1);
        bf2 = (Button) findViewById(R.id.bf2);
        bf2.setOnClickListener(handlerF2);
        bf3 = (Button) findViewById(R.id.bf3);
        bf3.setOnClickListener(handlerF3);
        bf4 = (Button) findViewById(R.id.bf4);
        bf4.setOnClickListener(handlerF4);
        bf5 = (Button) findViewById(R.id.bf5);
        bf5.setOnClickListener(handlerF5);
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
            // TCP Connector
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
            // TCP Connector
            Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerF1 = new View.OnClickListener() {
        public void onClick(View v) {
            // TCP Connector
            Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerF2 = new View.OnClickListener() {
        public void onClick(View v) {
            // TCP Connector
            Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerF3 = new View.OnClickListener() {
        public void onClick(View v) {
            // TCP Connector
            Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerF4 = new View.OnClickListener() {
        public void onClick(View v) {
            // TCP Connector
            Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerF5 = new View.OnClickListener() {
        public void onClick(View v) {
            // TCP Connector
            Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
        }
    };


}
