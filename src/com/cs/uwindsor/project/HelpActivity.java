package com.cs.uwindsor.project;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import java.net.URL;
import javax.xml.parsers.*;

import org.xml.sax.XMLReader;
import org.xml.sax.InputSource;

public class HelpActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help);	
		
	      WebView webview = (WebView)findViewById(R.id.webview);
	      //     webview.getSettings().setJavaScriptEnabled(true);
	      webview.getSettings().setLoadWithOverviewMode(true);
	      webview.getSettings().setUseWideViewPort(true);
	           
	      webview.setHorizontalScrollBarEnabled(false);
	      webview.loadUrl("file:///android_asset/uwindsorhelp.html");
	}
}
