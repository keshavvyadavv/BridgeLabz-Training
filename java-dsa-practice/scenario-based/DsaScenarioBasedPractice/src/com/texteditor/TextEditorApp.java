package com.texteditor;

//create main class
public class TextEditorApp {
 public static void main(String[] args) {
	 
	 //create the object of editor
     TextEditor editor = new TextEditor();

     //calling the methods
     editor.insert("Hello ");
     editor.insert("World");
     editor.display();

     editor.delete(5);
     editor.display();

     editor.undo();
     editor.display();

     editor.redo();
     editor.display();
 }
}