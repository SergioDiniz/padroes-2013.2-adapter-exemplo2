
public class Adaptador extends ClasseExistente{
	
	SuperClasse sc;
	
	public Adaptador(SuperClasse s){
		sc = s;
	}
	

	
	public void metodoEsperado(){
		sc.superOperacao();
	}

}
