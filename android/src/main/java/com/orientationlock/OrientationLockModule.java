package com.orientationlock;

import android.util.Log;
import android.support.annotation.Nullable;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class OrientationLockModule extends ReactContextBaseJavaModule {
  @Override
  public String getName() {
    return "OrientationLock";
  }

  @ReactMethod
  public void lockToPortrait() {

  }

  @ReactMethod
  public void lockToLandscape() {

  }

  @ReactMethod
  public void unlock() {

  }
}