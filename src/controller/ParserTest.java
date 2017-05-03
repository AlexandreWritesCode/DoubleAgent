package controller;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Agent;
import model.Database;
import model.Gender;

public class ParserTest {
	static Agent[] a;
	
	@BeforeClass
	static public void setup(){
		Database roster = new Database();
		Parser.CSVreader(roster);
		a = roster.getRoster("", 1000);
	}
	
	@Test
	public void firstAgentTest() {
		assertEquals("Jilted Seahorse", a[0].getName());
		assertEquals(34.014908, a[0].getLatitude(),0.0);
		assertEquals(-118.158966, a[0].getLongitude(),0.0);
		assertEquals(48, a[0].getAge());
		assertEquals(Gender.MALE, a[0].getGender());
	}

	@Test
	public void lastAgentTest() {
		assertEquals("Pensive Pony", a[a.length-1].getName());
		assertEquals(39.635548, a[a.length-1].getLatitude(),0.0);
		assertEquals(-86.13415, a[a.length-1].getLongitude(),0.0);
		assertEquals(83, a[a.length-1].getAge());
		assertEquals(Gender.MALE, a[a.length-1].getGender());
	}
}
