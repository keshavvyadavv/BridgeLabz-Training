package com.browsersbuddy;

class HistoryNode{
	String url;
	HistoryNode next;
	HistoryNode prev;
	
	HistoryNode(String url){
		this.url = url;
	}
}

public class Tab {
	private HistoryNode head;
	private HistoryNode current;
	
	public Tab(String url) {
		head = new HistoryNode(url);
		current = head;
	}
	
	//when you go at new page
	public void visit(String url) {
		HistoryNode newNode = new HistoryNode(url);
		current.next = newNode;
		newNode.prev = current;
		current = newNode;
	}
	
	//when you go back
	public void back() {
		if(current.prev != null) {
			current = current.prev;
		}
		else {
			System.out.println("No previous page is availablle");
		}
	}
	
	public void forward() {
		if(current.next != null) {
			current = current.next;
		}
		else {
			System.out.println("No next page is available.");
		}
	}
	
	public String getCurrentPage() {
		return current.url;
	}
	
}
