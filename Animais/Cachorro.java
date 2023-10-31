package Animais;

public class Cachorro extends Animal {

	public Cachorro (String nome, String sexo, String raca) {
		super (nome, sexo, raca);
	}
	@Override
	public void emitirsom () {
		System.out.println("o Cachorro esta Latindo");

	}
	@Override
	public void dormir() {
		System.out.println("o Cachorro esta dormindo");
		
	}
	@Override
	public void caminhar() {
		System.out.println("o Cachorro esta caminhando");
		
	}
	@Override
	public void correr() {
		System.out.println("o Cachorro esta correndo");
		
	}

}


