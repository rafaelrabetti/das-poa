
package logs;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public abstract class AbstractLogging {
	private final int tamanho = 2;
	private int indent = 0;
	
	@Pointcut
	protected abstract void logging();
	
	@Before("logging()")
	public void increaseIndent(){
		this.indent++;
	}
	
	@After("logging()")
	public void decreaseIndent(){
		this.indent--;
	}
	
	@Before(" call(void java.io.PrintStream.println(String)) ")
	public void beforePrintlnCall(){
		for(int i = 0, indent = this.indent*this.tamanho; i < indent; i++){
			System.out.print(" ");
		}
	}
}