package org.apache.cordova.CustomPlugin;

import android.content.Intent;

import com.demo.customplugin.NextActivity;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by xiaoshuai on 2016/12/14.
 */

public class GoToNextPagePlugin extends CordovaPlugin {
    private static final String ACTION="gotonextpage";
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if(ACTION.equals(action)){
            //获取js传递过来的参数
            String arg=args.getString(0);
            Intent intent=new Intent(cordova.getActivity(), NextActivity.class);
            intent.putExtra("arg",arg);
            cordova.getActivity().startActivity(intent);
            callbackContext.success("跳转成功");
            return true;
        }
        return super.execute(action, args, callbackContext);
    }
}
