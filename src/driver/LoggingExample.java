package driver;

public class LoggingExample {
	public void logAll() {
		System.out.println("[INFO] Executando tudo!");
		new DoX().info();
		new DoY().info();
	}
}
