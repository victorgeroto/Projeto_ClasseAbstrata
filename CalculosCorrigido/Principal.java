package CalculosCorrigido;

public class Principal {

	public static void main(String[] args) {
		
		Calculando calculando = new Calculando();
		
		System.out.println(calculando.somar(5, 5));
		
		System.out.println(calculando.sub(18, 8));
		
		System.out.println(calculando.multi(8, 4));
		
		System.out.println(calculando.div(80, 10));
		
		System.out.println(calculando.exp(6, 2));


	}

}
