
package logs;

import org.junit.Test;

import driver.LoggingExample;

public class LoggingTest{

	@Test
	public void doAll(){
		new LoggingExample().logAll();
	}
	
	public static void main(String[] args) {
		new LoggingExample().logAll();
	}
}
