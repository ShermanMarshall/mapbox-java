package com.mapbox.services.android.testapp;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;

import com.mapbox.mapboxsdk.Mapbox;
import com.squareup.leakcanary.LeakCanary;

import timber.log.Timber;

public class MasApplication extends Application {

  private static final String LOG_TAG = MasApplication.class.getSimpleName();

  @Override
  public void onCreate() {
    super.onCreate();

    // Leak canary
    if (LeakCanary.isInAnalyzerProcess(this)) {
      return;
    }
    LeakCanary.install(this);

    if (BuildConfig.DEBUG) {
      Timber.plant(new Timber.DebugTree());
    }

    // Access token
    String mapboxAccessToken = Utils.getMapboxAccessToken(getApplicationContext());
    if (TextUtils.isEmpty(mapboxAccessToken)) {
      Log.w(LOG_TAG, "Warning: access token isn't set.");
    }
    Mapbox.getInstance(getApplicationContext(), mapboxAccessToken);
  }
}
