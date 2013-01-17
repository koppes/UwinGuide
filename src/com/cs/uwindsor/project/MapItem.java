package com.cs.uwindsor.project;

import com.google.android.maps.GeoPoint;


public class MapItem {
	  private String name = "";
	  private double lat =0;
	  private double lng = 0;
	  GeoPoint point = new GeoPoint(
	            (int) (lat * 1E6), 
	            (int) (lng * 1E6));
      
      public MapItem(String n, String c[]) {
    	 name = n;
    	 lat = Double.parseDouble(c[0]);
         lng = Double.parseDouble(c[1]);
         point = new GeoPoint(
 	            (int) (lat * 1E6), 
 	            (int) (lng * 1E6));
    	  
      }
      
      public String getName() {
    	  return name;
      }
      
      public GeoPoint getPoint() {
    	  return point;
      }

}
