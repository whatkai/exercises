package com.ltree.expenses;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class SyncService extends IntentService {


    private static final String TAG="SyncService";

    public SyncService() {
        super("SyncService");
    }


    @Override
    public void onCreate() {
        super.onCreate();


    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "onCreate() called");
        Log.i(TAG, "Processing started");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.i(TAG,"Processing Finished");

    }
}
