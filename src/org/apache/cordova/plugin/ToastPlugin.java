package org.apache.cordova.plugin;

import android.util.Log;
import org.apache.cordova.api.*;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;

public class ToastPlugin extends CordovaPlugin {

    final String LOG_TAG = "ToastLog";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        Log.d(LOG_TAG, "Start Toast");

        final String toastText = args.getString(0);
        final int toastDuration = args.getInt(1);
        final CallbackContext ctx = callbackContext;

        Runnable runnable = new Runnable() {
            public void run() {
                Toast.makeText(cordova.getActivity().getApplicationContext(), toastText, toastDuration).show();
                ctx.success();
            }
        };

        cordova.getActivity().runOnUiThread(runnable);

        return true;
    }


}
