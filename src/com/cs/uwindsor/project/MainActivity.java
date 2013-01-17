package com.cs.uwindsor.project;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends Activity {
	public Context that;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		that = this;
	}	
		

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	
	public void map(View view) {
		Intent i = new Intent(that, MapTool.class);
		startActivity(i);
	}
	
	public void feed(View view) {
		Intent i = new Intent(that, FeedActivity.class);
		startActivity(i);
	}
	
	public void help(View view) {
		Intent i = new Intent(that, HelpActivity.class);
		startActivity(i);
	}
}

