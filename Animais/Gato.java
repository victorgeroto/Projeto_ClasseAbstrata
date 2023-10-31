package Animais;

public class Gato extends Animal{
	
	public Gato (String nome, String sexo, String raca) {
		super (nome, sexo, raca);
	}
	
	@Override
	public void emitirsom () {
		System.out.println("o gato esta Miauuuu");

	}

	@Override
	public void dormir() {
		System.out.println("o gato esta dormindo");
	}

	@Override
	public void caminhar() {
		System.out.println("o gato esta caminhando");
		
	}

	@Override
	public void correr() {
		System.out.println("o gato esta correndo");
		
	}

}


