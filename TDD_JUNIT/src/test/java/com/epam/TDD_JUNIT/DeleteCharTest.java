package com.epam.TDD_JUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeleteCharTest {

	/*
	 * 1. 2 chars : "AA" => "" ,"AB" =>"B","BA" => "B";
	 * 2. 1 chars : "A" =>"", "B"=>"B", "C"=>"C";
	 * 3. 4 chars : "AAAA" =>"AA","AABA"=>"BA","ABCD"=>"BCD","BACD"=>"BCD";
	 * 4. n chars :"AABAA"=>"BAA","ABCD"=>"BCD";
	 * 5. empty char =>"";
	 */
	DeleteChar removeAs;
	@BeforeEach
	void setUp() {
		removeAs = new DeleteChar();
	}
	@Test
	void test2Chars() {
		assertEquals("B",removeAs.remove("AB"));
		assertEquals("",removeAs.remove("AA"));
	}
	@Test
	void test1Chars() {
		assertEquals("B",removeAs.remove("B"));
		assertEquals("",removeAs.remove("A"));
	}
	@Test
	void test4Chars() {
		assertEquals("BCD",removeAs.remove("ABCD"));
		assertEquals("CD",removeAs.remove("AACD"));
		assertEquals("BCD",removeAs.remove("BACD"));
		assertEquals("BBAA",removeAs.remove("BBAA"));
	}
	@Test
	void testnChars() {
		assertEquals("BAA",removeAs.remove("AABAA"));
		assertEquals("BCDAB",removeAs.remove("BACDAB"));
	}
	@Test
	void testEmptyChars() {
		assertEquals("",removeAs.remove(""));
	}

}
