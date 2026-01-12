package com.browsersbuddy;
import java.util.Stack;

public class BrowsersBuddy {
	public static void main(String[] args) {
		 
		Stack<Tab> closeTabs = new Stack<>();
		
		Tab tab1 = new Tab("coding.com");
		tab1.visit("leetcode.com");
		tab1.visit("youtube.com");
		
		//get the current page
		System.out.println("Current page "+ tab1.getCurrentPage());
		
		//back page
		tab1.back();
		System.out.println("after back: " + tab1.getCurrentPage());
		
		//forward navigation
		tab1.forward();
		System.out.println("After forward: "+ tab1.getCurrentPage());
		
		//close tab
		closeTabs.push(tab1);
		System.out.println("tab closed.");
		
		Tab restoredTab = closeTabs.pop();
		System.out.println("Restored tab current page: "+restoredTab.getCurrentPage());
	}
}
