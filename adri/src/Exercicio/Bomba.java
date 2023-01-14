package Exercicio;

public class Bomba {
 
	/*
	 * FAZER A CLASSE BOMBA deve ter ter dois atributos o valor do commbustivel e 
	 * a quantidade total de combustivel, fazer quatro metodos
	 * 1- abastecer o carro: validação para se o valor a abasteccer : booleano 
	 * 		é maior que o preço do combustivel e se existe combustivel suficiente
	 * VALOR QUE VAI SER ABASTECIDO dividido P3LO preço do combustivel  
	 * 2- abastecer bomba 
	 * 	 SE A BOMBA ESTIVER COM MENOS DE 20 LITROS ADICIONAR 80 LITROS A ELA 
	 
	 *  */
	private float valorCombustivel = 3;
	private double quantBomba = 100;
	
	public Bomba() {
		
	}
	public Bomba(float valorCombustivel, double quantBomba) {
		setQuantBomba(quantBomba);
		setValorCombustivel(valorCombustivel); 
	}
	
	
	public double getQuantBomba() {
		return quantBomba;
	}

	public void setQuantBomba(double quantBomba) {
		this.quantBomba = quantBomba;
	}

	public void setValorCombustivel(float valorCombustivel) {
		this.valorCombustivel = valorCombustivel;
	}
	
	public boolean abastecer(float valorAbastecer) {
		boolean retorno = false;
		if(valorAbastecer >= valorCombustivel) {
			double litros = valorAbastecer / valorCombustivel;
			if(litros <= quantBomba) {
				quantBomba -= litros;
				retorno = true;
			}
		}
		return retorno;
		
	}
	
	public void abastecerBomba() {
		if(quantBomba < 20) {
			quantBomba += 80;
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [valorCombustivel=");
		builder.append(valorCombustivel);
		builder.append(", quantBomba=");
		builder.append(quantBomba);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
