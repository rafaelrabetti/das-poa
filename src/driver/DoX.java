package driver;

public class DoX implements DoThis{
	public void doThis() {
		System.out.println("Executando: " + this.getClass().getSimpleName());
	}
	
}
