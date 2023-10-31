package Animais;

public class Lobo extends Animal {

	public Lobo (String nome, String sexo, String raca) {
		super (nome, sexo, raca);
	}
	@Override
	public void emitirsom () {
		System.out.println("Lobo uinvando");

	}
	@Override
	public void dormir() {
		System.out.println("Lobo dormindo");
		
		
	}
	@Override
	public void caminhar() {
		System.out.println("Lobo caminhar");
		
	}
	@Override
	public void correr() {
		System.out.println("Lobo correndo");
		
	}

}

