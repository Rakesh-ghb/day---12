package com.constructor;

public class Book {
	String title;
    String author;
    public Book(String tit, String aut) {
		title=tit;
		author=aut;
	}
	
	public void display() {
		System.out.println("Book Title is :" + title);
		System.out.println("Author of the Book is :" + author);
	}
	public static void main(String[] args) {
		Book b1 = new Book("GOOD FRIEND","Baldwin");
		b1.display();
		Book b2 = new Book("Java","James Gosling");
		b2.display();
	}
}


