package com.fcbox.adapterdemo;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.zhy.autolayout.AutoLayoutActivity;

public class MainActivity extends AutoLayoutActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("xl","onCreate");
		setContentView(R.layout.activity_main);
		ImageView iv = findViewById(R.id.iv);
		ViewGroup.LayoutParams layoutParams = iv.getLayoutParams();
		int width = layoutParams.width;
		int height = layoutParams.height;
		Log.d("xl","width:"+width+"height:"+height);

		LinearLayout llRoot = findViewById(R.id.ll_root);
		ViewGroup.LayoutParams rootLayoutParams =llRoot.getLayoutParams();
		int rootWidth = rootLayoutParams.width;
		int rootHeight = rootLayoutParams.height;
		Log.d("xl","rootWidth:"+rootWidth+"rootHeight:"+rootHeight);

		/**
		 * 使用不用写一句话就能适配方案
		 */

		ViewGroup.LayoutParams params = null;
//		params.
		TypedArray typedArray = null;
		typedArray.getIndexCount();
//		typedArray.
	}


}
