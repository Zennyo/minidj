package com.mlh.zenyo.minidj;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView Test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test = (TextView)findViewById(R.id.TestText);
        Test.append(" ich bin ein Test");
        TCPClient client = new TCPClient("172.22.211.168", 6789, "Test1");
        client.start();
    }
}
