package com.fcbox.adapterdemo;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * @创建者 000778
 * @创建时间 2019/7/22
 * @描述
 */

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		AutoLayoutConifg.getInstance().useDeviceSize();
	}
}
