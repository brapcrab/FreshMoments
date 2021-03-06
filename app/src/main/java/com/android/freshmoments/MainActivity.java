package com.android.freshmoments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.braunster.androidchatsdk.firebaseplugin.firebase.BChatcatNetworkAdapter;
import com.braunster.chatsdk.Utils.helper.ChatSDKUiHelper;
import com.braunster.chatsdk.network.BDefines;
import com.braunster.chatsdk.network.BNetworkManager;
import com.braunster.chatsdk.activities.ChatSDKLoginActivity;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is used for the app custom toast and activity transition
        ChatSDKUiHelper.initDefault();

        // Init the network manager
        BNetworkManager.init(getApplicationContext());

        // Create a new adapter
        BChatcatNetworkAdapter adapter = new BChatcatNetworkAdapter(getApplicationContext());

        // Set the adapter
        BNetworkManager.sharedManager().setNetworkAdapter(adapter);

        Intent myIntent = new Intent(this, ChatSDKLoginActivity.class);
        startActivity(myIntent);
    }
}
