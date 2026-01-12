package com.texteditor;
import java.util.Stack;

public class TextEditor {
		
	 private StringBuilder content;
	 private Stack<Action> undoStack;
	 private Stack<Action> redoStack;
	
	 public TextEditor() {
	     content = new StringBuilder();
	     undoStack = new Stack<>();
	     redoStack = new Stack<>();
	 }
	
	 // add text
	 public void insert(String text) {
	     content.append(text);
	     undoStack.push(new Action("INSERT", text));
	     redoStack.clear(); 
	     System.out.println("Inserted: " + text);
	 }
	
	 //delete text
	 public void delete(int length) {
	     if (length > content.length()) {
	         System.out.println("Delete operation failed.");
	         return;
	     }
	
	     String deletedText = content.substring(content.length() - length);
	     content.delete(content.length() - length, content.length());
	     undoStack.push(new Action("DELETE", deletedText));
	     redoStack.clear();
	     System.out.println("Deleted: " + deletedText);
	 }
	
	 //undo operation
	 public void undo() {
	     if (undoStack.isEmpty()) {
	         System.out.println("Nothing to undo.");
	         return;
	     }
	
	     Action action = undoStack.pop();
	
	     if (action.type.equals("INSERT")) {
	         content.delete(content.length() - action.text.length(), content.length());
	     } else if (action.type.equals("DELETE")) {
	         content.append(action.text);
	     }
	
	     redoStack.push(action);
	     System.out.println("Undo performed.");
	 }
	
	 // Redo operation
	 public void redo() {
	     if (redoStack.isEmpty()) {
	         System.out.println("Nothing to redo.");
	         return;
	     }
	
	     Action action = redoStack.pop();
	
	     if (action.type.equals("INSERT")) {
	         content.append(action.text);
	     } else if (action.type.equals("DELETE")) {
	         content.delete(content.length() - action.text.length(), content.length());
	     }
	
	     undoStack.push(action);
	     System.out.println("Redo performed.");
	 }
	
	 // show current content
	 public void display() {
	     System.out.println("Current Text: " + content);
	 }
}
