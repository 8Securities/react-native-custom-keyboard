package com.facebook.react.uimanager;

import android.util.Log;
import android.content.Context;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.views.textinput.ReactEditText;

public class NativeHelper {
    public static ReactEditText getEditById(ReactApplicationContext context, int id) {
        UIViewOperationQueue uii = context.getNativeModule(UIManagerModule.class).getUIImplementation().getUIViewOperationQueue();
        Log.i("react-native", String.valueOf(id));
        return (ReactEditText) uii.getNativeViewHierarchyManager().resolveView(id);
    }
}