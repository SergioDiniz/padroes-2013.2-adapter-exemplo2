
public class Cliente {

	
	private ClasseExistente classeExistente;
	
	public Cliente(ClasseExistente c){
		classeExistente = c;
	}
	
	void operacao(){
		classeExistente.metodoEsperado();
	}
}
