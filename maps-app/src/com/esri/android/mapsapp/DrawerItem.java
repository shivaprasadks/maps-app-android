/*
 * COPYRIGHT 1995-2014 ESRI
 *
 * TRADE SECRETS: ESRI PROPRIETARY AND CONFIDENTIAL
 * Unpublished material - all rights reserved under the
 * Copyright Laws of the United States.
 *
 * For additional information, contact:
 * Environmental Systems Research Institute, Inc.
 * Attn: Contracts Dept
 * 380 New York Street
 * Redlands, California, USA 92373
 *
 * email: contracts@esri.com
 */

package com.esri.android.mapsapp;

import android.view.View;

/**
 * Represents an item in the navigation drawer list.
 */
public class DrawerItem {
  public interface OnClickListener {
    public void onClick();
  }

  private final OnClickListener mListener;

  private final View mView;

  public DrawerItem(View view, OnClickListener listener) {
    mView = view;
    mListener = listener;
  }

  /**
   * Invokes the OnClickListener registered with this DrawerItem.
   */
  public void onClicked() {
    if (mListener != null) {
      mListener.onClick();
    }
  }

  public View getView() {
    return mView;
  }
}
