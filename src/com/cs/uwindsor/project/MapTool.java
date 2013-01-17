package com.cs.uwindsor.project;

import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MapTool extends MapActivity {
	public Context that;
	
	
	 MapView mapView;
	 List<Overlay> mapOverlays;
	 Drawable drawable;
	 HelloItemizedOverlay itemizedoverlay;
	 CheckBox residence;
	 CheckBox academic;
	 MapItem[] resItems = new MapItem[6];
	 MapItem[] acaItems = new MapItem[18];
	 

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map);
		that = this;
		
		mapView = (MapView) findViewById(R.id.mapview);
		drawable = this.getResources().getDrawable(R.drawable.star);
		itemizedoverlay = new HelloItemizedOverlay(drawable,this);
		mapOverlays = mapView.getOverlays();
		
	    residence = (CheckBox) findViewById(R.id.CheckBox1);
		academic = (CheckBox) findViewById(R.id.CheckBox2);
		
		mapView.setBuiltInZoomControls(true);
		mapView.setSatellite(true);
		 
		resItems[0] =  new MapItem("Alumni Hall", new String[] {"42.30277", "-83.06304"});
		resItems[1] =  new MapItem("Cartier Hall", new String[] {"42.30385", "-83.06810"});
		resItems[2] =  new MapItem("Clark Residence", new String[] {"42.30302", "-83.06391"});
		resItems[3] =  new MapItem("Electa Hall", new String[] {"42.30923", "-83.06941"});
		resItems[4] =  new MapItem("Laurier Hall", new String[] {"42.30460", "-83.06764"});
		resItems[5] =  new MapItem("Macdonald Hall", new String[] {"42.30486", "-83.06853"});
		
		acaItems[0] =  new MapItem("Toldo Centre", new String[] {"42.30653", "-83.06556"});
		acaItems[1] =  new MapItem("Biology Building", new String[] {"42.30561", "-83.06631"});
		acaItems[2] =  new MapItem("Canterbury College", new String[] {"42.31009", "-83.06842"});
		acaItems[3] =  new MapItem("Chrysler Hall South", new String[] {"42.30615", "-83.06623"});
		acaItems[4] =  new MapItem("Chrysler Hall North", new String[] {"42.30724", "-83.06696"});
		acaItems[5] =  new MapItem("Dillon Hall", new String[] {"42.30634", "-83.06766"});
		acaItems[6] =  new MapItem("Education Building", new String[] {"42.30721", "-83.06605"});
		acaItems[7] =  new MapItem("Erie Hall", new String[] {"42.30517", "-83.06529"});
		acaItems[8] =  new MapItem("Lambton Tower", new String[] {"42.30540", "-83.06562"});
		acaItems[9] =  new MapItem("Essex Hall", new String[] {"42.30511", "-83.06674"});
		acaItems[10] =  new MapItem("Law Building", new String[] {"42.30859", "-83.06764"});
		acaItems[11] =  new MapItem("Leddy Library", new String[] {"42.30770", "-83.06771"});
		acaItems[12] =  new MapItem("Medical Education Building", new String[] {"42.30620", "-83.06515"});
		acaItems[13] =  new MapItem("Memorial Hall", new String[] {"42.30699", "-83.06811"});
		acaItems[14] =  new MapItem("Music Building", new String[] {"42.30422", "-83.06476"});
		acaItems[15] =  new MapItem("Odette Centre", new String[] {"42.30524", "-83.06469"});
		acaItems[16] =  new MapItem("St. Denis Centre", new String[] {"42.29865", "-83.06146"});
		acaItems[17] =  new MapItem("Vanier Hall", new String[] {"42.30432", "-83.06829"});
		 
		OverlayItem[] resOverlays = new OverlayItem[resItems.length];
		OverlayItem[] acaOverlays = new OverlayItem[acaItems.length];

		 

		 if(residence.isChecked()) {
			 
			 for(int i = 0; i < resItems.length; i++) {
				 resOverlays[i] = new OverlayItem(resItems[i].getPoint(), resItems[i].getName(), "I'm in " +  resItems[i].getName() + "!");
				 itemizedoverlay.addOverlay(resOverlays[i]);
			 }
			 mapOverlays.add(itemizedoverlay);
		 }
		 
		 if(academic.isChecked()) {
			 for(int i = 0; i < acaItems.length; i++) {
				 acaOverlays[i] = new OverlayItem(acaItems[i].getPoint(), acaItems[i].getName(), "I'm in " +  acaItems[i].getName() + "!");
				 itemizedoverlay.addOverlay(acaOverlays[i]);
			 }
			 mapOverlays.add(itemizedoverlay);
		 }


    }
	
    @Override
	protected boolean isRouteDisplayed() {
		 return false;
   }
		

	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	
	public void updateMap(View v) {
		
		itemizedoverlay = new HelloItemizedOverlay(drawable,this);
		mapOverlays.clear();

		 OverlayItem[] resOverlays = new OverlayItem[resItems.length];
		 OverlayItem[] acaOverlays = new OverlayItem[acaItems.length];

		 if(residence.isChecked()) {
			 
			 for(int i = 0; i < resItems.length; i++) {
				 resOverlays[i] = new OverlayItem(resItems[i].getPoint(), resItems[i].getName(), "I'm in " +  resItems[i].getName() + "!");
				 itemizedoverlay.addOverlay(resOverlays[i]);
			 }
			 mapOverlays.add(itemizedoverlay);
		 }
		 
		 if(academic.isChecked()) {
			 for(int i = 0; i < acaItems.length; i++) {
				 acaOverlays[i] = new OverlayItem(acaItems[i].getPoint(), acaItems[i].getName(), "I'm in " +  acaItems[i].getName() + "!");
				 itemizedoverlay.addOverlay(acaOverlays[i]);
			 }
			 mapOverlays.add(itemizedoverlay);
		 }
	}

	
	public void main(View view) {
		
		Intent i = new Intent(that, MainActivity.class);
		startActivity(i);
	}
	
	
}
