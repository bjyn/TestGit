package com.example.treedemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button=new Button(this);
		button.setX(100);
		button.setY(200);
		button.setText("12456");
		button.setWidth(60);
		button.setHeight(60);
		button.setTextSize(12);
		AbsoluteLayout absoluteLayout =new AbsoluteLayout(this);
		absoluteLayout.setBackgroundColor(Color.WHITE);
		absoluteLayout.addView(button);
		// 在此处输入绝对布局的长宽
		LayoutParams absoluteLayoutParams=new LayoutParams(1500,1500);
		LinearLayout treeLayout=(LinearLayout) this.findViewById(R.id.tree_layout);
		treeLayout.addView(absoluteLayout,absoluteLayoutParams);
		
	}
	
	private void generateTreeBeans(){
		
	}
	
	


}
