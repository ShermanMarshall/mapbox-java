package com.mapbox.services.constants;

import com.mapbox.services.BuildConfig;

import java.util.Locale;

/**
 * Includes common variables used throughout the Mapbox Service modules.
 *
 * @since 3.0.0
 */
public final class Constants {

  private Constants() {
    // Empty constructor prevents users from initializing this class
  }

  /**
   * User agent for HTTP requests.
   *
   * @since 1.0.0
   */
  public static final String HEADER_USER_AGENT
    = String.format(Locale.US, "MapboxJava/%s (%s)",
    BuildConfig.VERSION, BuildConfig.GIT_REVISION);

  /**
   * Base URL for all API calls, not hardcoded to enable testing.
   *
   * @since 1.0.0
   */
  public static final String BASE_API_URL = "https://api.mapbox.com";

  /**
   * The default user variable used for all the Mapbox user names.
   *
   * @since 1.0.0
   */
  public static final String MAPBOX_USER = "mapbox";
}