package se.yrgo.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book bok1 = new Book(5, "", "", "", "", 0);
		Book bok2 = new Book(5, "", "", "", "", 0);
		assertEquals(bok1, bok2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book bok1 = new Book(2, "", "", "", "", 0);
		Book bok2 = new Book(5, "", "", "", "", 0);
		assertNotEquals(bok1, bok2);
	}

}
