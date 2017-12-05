package driver;

public class DoX implements Logger{
	public void info() {
		System.out.println("[INFO] Executando: " + this.getClass().getSimpleName());
	}
	
}
