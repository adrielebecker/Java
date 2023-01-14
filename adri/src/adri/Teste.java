package adri;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* alt + shift + R = CTRL + D
		 * sysout + ctrl + espace
		 *
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Favor querido usuario digitar um Número: ");
		int numero = entrada.nextInt(); 
		/*if(numero % 2 == 0) {
			numero = numero + 1; 
		} 
		else{
			numero = numero + 2; 
		}
		System.out.printf("Seu número é: "+ numero);
		System.out.print("Favor querido usuario digitar um nome: ");
		entrada.nextLine();
		String nome = entrada.nextLine(); //limpa o Scanner
		System.out.print(nome);*/
		int[] array = new int[numero+1];
		for (int i = 0; i <= numero; i++) {
			array[i] = i+10;
			System.out.println(array[i]);
		}
		/*while (numero != 2) {
			System.out.println(1);
		}*/
		entrada.close();
		
		
	}

}
