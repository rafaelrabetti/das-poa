package driver;

public class DoY implements Logger{
	public void info() {
		System.out.println("[INFO] Executando: " + this.getClass().getSimpleName());
	}
}
