/*
package com.example.plugin;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.Toast;

//import com.liveperson.infra.InitLivePersonProperties;
//import com.liveperson.infra.callbacks.InitLivePersonCallBack;
//import com.liveperson.messaging.sdk.api.LivePerson;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class LPMessagingSDK extends CordovaPlugin {

    private static final String TAG = LPMessagingSDK.class.getSimpleName();
    public static final String SDK_SAMPLE_APP_ID = "com.liveperson.sdk_cordova_sample";
    private static final String ACCOUNT_ID = "lp_account_id";
    private SharedPreferences mDefaultSharedPreferences;
//
//    @Override
//    protected void pluginInitialize() {
//        super.pluginInitialize();
//
//        mDefaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(cordova.getActivity().getApplicationContext());
//        String accountId = mDefaultSharedPreferences.getString(ACCOUNT_ID, "65861854");
//        LivePerson.initialize(cordova.getActivity(), new InitLivePersonProperties(accountId, SDK_SAMPLE_APP_ID, new InitLivePersonCallBack() {
//            @Override
//            public void onInitSucceed() {
//                Log.i(TAG, "SDK initialize completed successfully");
//                cordova.getActivity().runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        Toast.makeText(cordova.getActivity(), "Init End Successfully", Toast.LENGTH_SHORT).show();
//                    }
//                });
//            }
//
//            @Override
//            public void onInitFailed(Exception e) {
//                Log.i(TAG, "SDK initialize completed with error");
//                cordova.getActivity().runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        Toast.makeText(cordova.getActivity(), "Init Failed", Toast.LENGTH_SHORT).show();
//                    }
//                });
//            }
//        }));
//
//    }
//
//    @Override
//    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
//        if (action.equals("startConversation")) {
//            cordova.getActivity().runOnUiThread(new Runnable() {
//                @Override
//                public void run() {
//                    LivePerson.showConversation(cordova.getActivity());
//                }
//            });
//            return true;
//        }
//        return false;
//    }


    */
/**
     * Called after plugin construction and fields have been initialized.
     * Prefer to use pluginInitialize instead since there is no value in
     * having parameters on the initialize() function.
     *//*

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {

    }

    */
/**
     * Called after plugin construction and fields have been initialized.
     *//*

    protected void pluginInitialize() {
    }

    public boolean execute(String action, String rawArgs, CallbackContext callbackContext) throws JSONException {
        JSONArray args = new JSONArray(rawArgs);
        return execute(action, args, callbackContext);
    }


    public boolean execute(final String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        Log.v(TAG,"LPMessagingSDK   received account id:"+ action);
        if (action.equals("startConversation")) {

            String name = args.getString(0);
            String message = "Hello, " + name;
            callbackContext.success(message);

            return true;

        } else {

            return false;

        }

//        cordova.getActivity().runOnUiThread(new Runnable() {
//                                                public void run() {
//                                                    Toast toast = Toast.makeText(cordova.getActivity().getApplicationContext(), action, , Toast.LENGTH_LONG);
//                                                    toast.show();
//                                                }
//                                            });




//        if(action.equals("startConversation")) {
//
//            cordova.getActivity().runOnUiThread(new Runnable() {
//                public void run() {
//                    String accountId = action;
//                    LivePerson.initialize(cordova.getActivity(), new InitLivePersonProperties(accountId, SDK_SAMPLE_APP_ID, new InitLivePersonCallBack() {
//                        @Override
//                        public void onInitSucceed() {
//                            Log.i(TAG, "SDK initialize completed successfully");
//                            cordova.getActivity().runOnUiThread(new Runnable() {
//                                @Override
//                                public void run() {
//                                    Toast.makeText(cordova.getActivity(), "Init End Successfully", Toast.LENGTH_SHORT).show();
//                                    LivePerson.showConversation(cordova.getActivity());
//                                    callbackContext.success("Init End Successfully");
//                                }
//                            });
//                        }
//
//                        @Override
//                        public void onInitFailed(Exception e) {
//                            Log.i(TAG, "SDK initialize completed with error");
//                            cordova.getActivity().runOnUiThread(new Runnable() {
//                                @Override
//                                public void run() {
//                                    Toast.makeText(cordova.getActivity(), "Init Failed", Toast.LENGTH_SHORT).show();
//                                }
//                            });
//                        }
//                    }));
//
//                }
//            });

//            return true;
//        }else{
//            return false;
//        }
    }

}
*/

package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class LPMessagingSDK extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("startConversation")) {

            String name = data.getString(0);
            String message = "Hello, " + name;
            callbackContext.success(message);

            return true;

        } else {

            return false;

        }
    }
}

