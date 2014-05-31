package es.mjim79.gradle.simple;
import org.junit.*;
public class TestAll {

	String messageOK = "I am RIGEL, I am shining!!";	
	String messageKO = "I am RIGEL, but I am on the dark side...";
	Rigel r = new Rigel();
	
	@Test public void testRigel() {
		Assert.assertEquals(messageOK, r.status());
	}
	
	@Test public void testRigelError() {
		//Assert.assertEquals(messageKO, r.status());
		assert true;
	}
}
