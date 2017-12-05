package driver;

public class DoY implements DoThis{
	public void doThis() {
		System.out.println("Executando: " + this.getClass().getSimpleName());
	}
}
