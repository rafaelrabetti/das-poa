
package logs;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect extends AbstractLogging{
	
	@Pointcut("(execution(* *.*logAll()) || execution(* *.*info()))")
	protected void logging(){
	}

	
	@Around("logging()")
	public void doTheThing(final ProceedingJoinPoint joinPoint) throws Throwable{
		final String joinPointName = joinPoint.getThis().getClass().getSimpleName() + "." + joinPoint.getSignature().getName() + "()";
		System.out.println("[INFO] Entrando em [" + joinPointName + "]");
		joinPoint.proceed();
		System.out.println("[INFO] Saindo de [" + joinPointName + "]");
	}
	
	
}
