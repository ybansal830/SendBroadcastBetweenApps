package com.myfirst.sendbroadcastbetweenappssecondapp;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastReceive extends android.content.BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(context,BroadcastReceiveActivity.class);
        intent1.putExtra("data",intent.getStringExtra("message"));
        context.startActivity(intent1);
    }
}
