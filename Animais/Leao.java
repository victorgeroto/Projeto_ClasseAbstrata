package Animais;

public class Leao  extends Animal{
	
	public Leao (String nome, String sexo, String raca) {
		super (nome, sexo, raca);
	}
	@Override
	public void emitirsom () {
		System.out.println("o Leao esta Rugindo");

	}
	@Override
	public void dormir() {
		System.out.println("o leao esta dormindo");
		
	}
	@Override
	public void caminhar() {
		System.out.println("o leao esta Caminhando");
		
	}
	@Override
	public void correr() {
		System.out.println("o leao esta Correndo");
		
	}
}


