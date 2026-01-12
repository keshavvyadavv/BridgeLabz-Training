package com.ambulanceroute;
// create AmbulanceRouteApp
public class AmbulanceRouteApp {
	public static void main(String[] args) {
		
		RouteManage route = new RouteManage();
		
		route.addUnit("Emergendy", false);
		route.addUnit("Radiology", false);
		route.addUnit("Surgery", false);
		route.addUnit("ICU", true);
		
		route.findAvailableUnit();
		
		route.removeUnit("Surgery");
		route.findAvailableUnit();
		
	}
}
