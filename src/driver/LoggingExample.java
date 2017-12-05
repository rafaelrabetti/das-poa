package driver;

public class LoggingExample {
	public void logAll() {
		System.out.println("Executando tudo!");
		new DoX().info();
		new DoY().info();
	}
}
