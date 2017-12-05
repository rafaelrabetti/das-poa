
package logs;

import org.junit.Test;

import driver.Example;

public class LoggingTest{

	@Test
	public void doAll(){
		new Example().doAll();
	}
	
	public static void main(String[] args) {
		new Example().doAll();
	}
}
