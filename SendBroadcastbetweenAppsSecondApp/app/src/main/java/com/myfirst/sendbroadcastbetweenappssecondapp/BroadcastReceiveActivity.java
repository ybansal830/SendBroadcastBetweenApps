package com.myfirst.sendbroadcastbetweenappssecondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BroadcastReceiveActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receive);
        mTextView = findViewById(R.id.textView);
        mTextView.setText(getIntent().getStringExtra("data"));
    }
}