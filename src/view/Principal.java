package view;
import controller.ParesControle;

public class Principal {

	public static void main(String arqs[]) {
		ParesControle PC = new ParesControle();
		int vetor[] = {1, 2, 3, 4, 5};
		int tamanho = vetor.length;
		
		System.out.println("O n�mero de pares no vetor �: "+PC.Pares(vetor, tamanho));
	}

}
