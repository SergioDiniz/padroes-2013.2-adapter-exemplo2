
public class App {
	
	public static void main(String[] args) {
		Adaptador a = new Adaptador(new SuperSaijinClasse());
		Cliente c = new Cliente( a );
		c.operacao();
	}

}
