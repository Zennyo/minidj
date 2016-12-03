package com.mlh.zenyo.minidj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Toast;
import logic.Item;
import android.os.StrictMode;

public class MainActivity extends AppCompatActivity {

    private static final int PORT = 6080;
    private static final String IP_ADDRESS = "172.22.220.191";
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
    private SeekBar sb;
    private TCPClient tcp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
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

        sb = (SeekBar) findViewById(R.id.seekBar);
        sb.setOnSeekBarChangeListener(handlerSeekbar);


    }
    View.OnClickListener handlerPlay1 = new View.OnClickListener() {
        public void onClick(View v) {
            Item item = new Item();
            item.setPayload("play1");
            tcp = new TCPClient(IP_ADDRESS,PORT);
            tcp.send(item);
            Toast.makeText(MainActivity.this, "Play1", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerPlay2 = new View.OnClickListener() {
        public void onClick(View v) {
            Item item = new Item();
            item.setPayload("play2");
            tcp = new TCPClient(IP_ADDRESS,PORT);
            tcp.send(item);
            Toast.makeText(MainActivity.this, "Play2", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerStop1 = new View.OnClickListener() {
        public void onClick(View v) {
            Item item = new Item();
            item.setPayload("stop1");
            tcp = new TCPClient(IP_ADDRESS,PORT);
            tcp.send(item);
            Toast.makeText(MainActivity.this, "Stop1", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerStop2 = new View.OnClickListener() {
        public void onClick(View v) {
            Item item = new Item();
            item.setPayload("stop2");
            tcp = new TCPClient(IP_ADDRESS,PORT);
            tcp.send(item);
            Toast.makeText(MainActivity.this, "Stop2", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerPause1 = new View.OnClickListener() {
        public void onClick(View v) {
            Item item = new Item();
            item.setPayload("pause1");
            tcp = new TCPClient(IP_ADDRESS,PORT);
            tcp.send(item);
            Toast.makeText(MainActivity.this, "Pause1", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerPause2 = new View.OnClickListener() {
        public void onClick(View v) {
            Item item = new Item();
            item.setPayload("pause2");
            tcp = new TCPClient(IP_ADDRESS,PORT);
            tcp.send(item);
            Toast.makeText(MainActivity.this, "Pause2", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerF1 = new View.OnClickListener() {
        public void onClick(View v) {
            Item item = new Item();
            item.setPayload("customkey1");
            tcp = new TCPClient(IP_ADDRESS,PORT);
            tcp.send(item);
            Toast.makeText(MainActivity.this, "F1", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerF2 = new View.OnClickListener() {
        public void onClick(View v) {
            Item item = new Item();
            item.setPayload("customkey2");
            tcp = new TCPClient(IP_ADDRESS,PORT);
            tcp.send(item);
            Toast.makeText(MainActivity.this, "F2", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerF3 = new View.OnClickListener() {
        public void onClick(View v) {
            Item item = new Item();
            item.setPayload("customkey3");
            tcp.send(item);
            Toast.makeText(MainActivity.this, "F3", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerF4 = new View.OnClickListener() {
        public void onClick(View v) {
            Item item = new Item();
            item.setPayload("customkey4");
            tcp = new TCPClient(IP_ADDRESS,PORT);
            tcp.send(item);
            Toast.makeText(MainActivity.this, "F4", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handlerF5 = new View.OnClickListener() {
        public void onClick(View v) {
            Item item = new Item();
            item.setPayload("customkey5");
            tcp = new TCPClient(IP_ADDRESS,PORT);
            tcp.send(item);
            Toast.makeText(MainActivity.this, "F5", Toast.LENGTH_SHORT).show();
        }
    };
    SeekBar.OnSeekBarChangeListener handlerSeekbar = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            Item item = new Item();
            item.setPayload("volume");
            item.setvolume(((int) sb.getProgress()));
            tcp = new TCPClient(IP_ADDRESS,PORT);
            tcp.send(item);
            //Toast.makeText(MainActivity.this, "Seekbar: " + ((int) sb.getProgress()), Toast.LENGTH_SHORT).show();


        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }

    };


}
