package Animais;

public class Tigre  extends Animal{

	public Tigre (String nome, String sexo, String raca) {
		super (nome, sexo, raca);
	}
	@Override
	public void emitirsom () {
		System.out.println("Tigre ronca");

	}
	@Override
	public void dormir() {
		System.out.println("Tigre dormindo");
		
	}
	@Override
	public void caminhar() {
		System.out.println("Tigre caminhando");
		
	}
	@Override
	public void correr() {
		System.out.println("Tigre Correndo");
		
	}

}