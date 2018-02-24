package com.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test
	public void testSetTitle() {
		Book book = new Book();
		book.setTitle("Learn Java");
		assertEquals("Learn Java", book.getTitle());
	}

	@Test
	public void testSetAuthor() {
		Book book = new Book();
		book.setAuthor("Kiran");
		assertEquals("Kiran", book.getAuthor());
		
	}
	
	@Test
	public void testToString() {
		Book book = new Book();
		book.setTitle("Learn Spring");
		book.setAuthor("Kiran");
		assertEquals("Learn Spring written by Kiran", book.toString());
		
	}
}
