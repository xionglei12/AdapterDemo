package com.fcbox.adapterdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.zhy.autolayout.AutoLayoutActivity;

public class MainActivity extends AutoLayoutActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageView iv = findViewById(R.id.iv);
		ViewGroup.LayoutParams layoutParams = iv.getLayoutParams();
		int width = layoutParams.width;
		int height = layoutParams.height;
		Log.d("xl","width:"+width+"height:"+height);
		// todo 发现并没有很好的适配
	}
}
