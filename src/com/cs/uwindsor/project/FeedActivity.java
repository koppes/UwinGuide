package com.cs.uwindsor.project;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.net.URL;
import java.util.List;
import javax.xml.parsers.*;

import org.xml.sax.XMLReader;
import org.xml.sax.InputSource;

import com.google.android.maps.Overlay;

public class FeedActivity extends Activity {
	public Context that;
	//WebView webview;   //karun
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feed);
		that = this;
		// added by Karun
		WebView webview = new WebView(this);
		//setContentView(webview);
		
		
		TextView title1 = (TextView) findViewById(R.id.Title1);
		TextView title2 = (TextView) findViewById(R.id.Title2);
		TextView title3 = (TextView) findViewById(R.id.Title3);
		TextView title4 = (TextView) findViewById(R.id.Title4);
		TextView title5 = (TextView) findViewById(R.id.Title5);
		TextView title6 = (TextView) findViewById(R.id.Title6);
		TextView title7 = (TextView) findViewById(R.id.Title7);
		TextView title8 = (TextView) findViewById(R.id.Title8);
		TextView title9 = (TextView) findViewById(R.id.Title9);
		TextView title10 = (TextView) findViewById(R.id.Title10);
		
		TextView desc1 = (TextView) findViewById(R.id.Description1);
		TextView desc2 = (TextView) findViewById(R.id.Description2);
		TextView desc3 = (TextView) findViewById(R.id.Description3);
		TextView desc4 = (TextView) findViewById(R.id.Description4);
		TextView desc5 = (TextView) findViewById(R.id.Description5);
		TextView desc6 = (TextView) findViewById(R.id.Description6);
		TextView desc7 = (TextView) findViewById(R.id.Description7);
		TextView desc8 = (TextView) findViewById(R.id.Description8);
		TextView desc9 = (TextView) findViewById(R.id.Description9);
		TextView desc10 = (TextView) findViewById(R.id.Description10);
		
		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		Button button3 = (Button) findViewById(R.id.button3);
		Button button4 = (Button) findViewById(R.id.button4);
		Button button5 = (Button) findViewById(R.id.button5);
		Button button6 = (Button) findViewById(R.id.button6);
		Button button7 = (Button) findViewById(R.id.button7);
		Button button8 = (Button) findViewById(R.id.button8);
		Button button9 = (Button) findViewById(R.id.button9);
		Button button10 = (Button) findViewById(R.id.button10);

		//define webview - Added by Karun
		webview = (WebView)findViewById(R.id.webview);
		
		try
        {
            // setup the url
           URL url = new URL("http://www.uwindsor.ca/dailynews/feed");
   		webview.setHorizontalScrollBarEnabled(false);
   		webview.loadUrl("file:///android_asset/uwindsorhelp.html");

           // create the factory
           SAXParserFactory factory = SAXParserFactory.newInstance();
           // create a parser
           SAXParser parser = factory.newSAXParser();

           // create the reader (scanner)
           XMLReader xmlreader = parser.getXMLReader();
           // instantiate our handler
           RSSHandler theRssHandler = new RSSHandler();
           // assign our handler
           xmlreader.setContentHandler(theRssHandler);
           // get our data through the url class
           InputSource is = new InputSource(url.openStream());
           // perform the synchronous parse           
           xmlreader.parse(is);
           // get the results - should be a fully populated RSSFeed instance, 
		   // or null on error
           RSSFeed feed = theRssHandler.getFeed();

           RSSItem item = feed.getItem(0);
           title1.setText(item.getTitle());
           desc1.setText(item.getPubDate());
           final String link1 = item.getLink();
           
           button1.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   // Perform action on click
            	   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link1));
            	   startActivity(browserIntent);

               }
           });

           
           item = feed.getItem(1);
           title2.setText(item.getTitle());
           desc2.setText(item.getPubDate());
           final String link2 = item.getLink();
           
           button2.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   // Perform action on click
            	   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link2));
            	   startActivity(browserIntent);

               }
           });
           
           item = feed.getItem(2);
           title3.setText(item.getTitle());
           desc3.setText(item.getPubDate());
           final String link3 = item.getLink();
           
           button3.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   // Perform action on click
            	   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link3));
            	   startActivity(browserIntent);

               }
           });
           
           item = feed.getItem(3);
           title4.setText(item.getTitle());
           desc4.setText(item.getPubDate());
           final String link4 = item.getLink();
           
           button4.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   // Perform action on click
            	   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link4));
            	   startActivity(browserIntent);

               }
           });
           
           item = feed.getItem(4);
           title5.setText(item.getTitle());
           desc5.setText(item.getPubDate());
           final String link5 = item.getLink();
           
           button5.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   // Perform action on click
            	   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link5));
            	   startActivity(browserIntent);

               }
           });
           
           item = feed.getItem(5);
           title6.setText(item.getTitle());
           desc6.setText(item.getPubDate());
           final String link6 = item.getLink();
           
           button6.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   // Perform action on click
            	   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link6));
            	   startActivity(browserIntent);

               }
           });
           
           item = feed.getItem(6);
           title7.setText(item.getTitle());
           desc7.setText(item.getPubDate());
           final String link7 = item.getLink();
           
           button7.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   // Perform action on click
            	   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link7));
            	   startActivity(browserIntent);

               }
           });
           
           item = feed.getItem(7);
           title8.setText(item.getTitle());
           desc8.setText(item.getPubDate());
           final String link8 = item.getLink();
           
           button8.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   // Perform action on click
            	   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link8));
            	   startActivity(browserIntent);

               }
           });
           
           item = feed.getItem(8);
           title9.setText(item.getTitle());
           desc9.setText(item.getPubDate());
           final String link9 = item.getLink();
           
           button9.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   // Perform action on click
            	   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link9));
            	   startActivity(browserIntent);

               }
           });
           
           item = feed.getItem(9);
           title10.setText(item.getTitle());
           desc10.setText(item.getPubDate());
           final String link10 = item.getLink();
           
           button10.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   // Perform action on click
            	   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link10));
            	   startActivity(browserIntent);

               }
           });

           
        }
        catch (Exception ee)
        {
            
        }
	
	}	
		

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	
	public void main(View view) {
		
		Intent i = new Intent(that, MainActivity.class);
		startActivity(i);
	}
}

