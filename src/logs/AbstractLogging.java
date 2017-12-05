
package logs;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public abstract class AbstractLogging {
	private int num = 0;
	
	@Pointcut
	protected abstract void logging();
	
	@Before("logging()")
	public void increaseNum(){
		this.num++;
	}
	
	@Before(" call(void java.io.PrintStream.println(String)) ")
	public void beforePrintlnCall(){
		for(int i = 0; i < num; i++){
			System.out.print(" " + num);
		}
	}
}