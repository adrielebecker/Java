package Exercicio;

public class MainBomba {

	public static void main(String[] args) {
		Bomba b = new Bomba();
		b.abastecer(300);
		b.abastecerBomba();
		System.out.println(b.toString());
	}

}
